package com.wqz.dm.service;

import java.util.List;

import com.wqz.dm.pojo.AllFaceTag;

public interface MakerService
{
	List<AllFaceTag> selectSameTagUnmarkedRecord(Integer start, Integer size);
	List<AllFaceTag> selectAgeTagUnmarkedRecord(Integer start, Integer size);
	Boolean markSameTagAndHumTag(Integer id, Long sameTag,Boolean isHuman);
	Boolean markAgeTagAndSexTag(Integer id, Integer ageTag,Boolean isMaleTag);
}
