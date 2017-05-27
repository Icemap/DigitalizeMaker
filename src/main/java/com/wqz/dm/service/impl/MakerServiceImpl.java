package com.wqz.dm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wqz.dm.dao.AllFaceTagMapper;
import com.wqz.dm.pojo.AllFaceTag;
import com.wqz.dm.service.MakerService;
import com.wqz.dm.utils.ByteBooleanUtils;

@Service
public class MakerServiceImpl implements MakerService
{
	@Autowired
	AllFaceTagMapper allFaceTagMapper;
	
	@Override
	public List<AllFaceTag> selectSameTagUnmarkedRecord(Integer start, Integer size)
	{
		return allFaceTagMapper.selectSameTagUnmarked(start, size);
	}

	@Override
	public List<AllFaceTag> selectAgeTagUnmarkedRecord(Integer start, Integer size)
	{
		return allFaceTagMapper.selectAgeTagUnmarked(start, size);
	}

	@Override
	public Boolean markSameTagAndHumTag(Integer id, Long sameTag, Boolean isHuman)
	{
		AllFaceTag allFaceTag = new AllFaceTag();
		allFaceTag.setId(id);
		allFaceTag.setSametag(sameTag);
		allFaceTag.setHumantag(ByteBooleanUtils.boolean2Byte(isHuman));
		return allFaceTagMapper.updateByPrimaryKeySelective(allFaceTag) == 1;
	}

	@Override
	public Boolean markAgeTagAndSexTag(Integer id, Integer ageTag, Boolean isMaleTag)
	{
		AllFaceTag allFaceTag = new AllFaceTag();
		allFaceTag.setId(id);
		allFaceTag.setAgetag(ageTag);
		allFaceTag.setIsmaletag(ByteBooleanUtils.boolean2Byte(isMaleTag));
		return allFaceTagMapper.updateByPrimaryKeySelective(allFaceTag) == 1;
	}
}
