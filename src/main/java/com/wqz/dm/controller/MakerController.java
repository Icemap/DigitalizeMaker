package com.wqz.dm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wqz.dm.service.impl.MakerServiceImpl;

@Controller
@RequestMapping("/maker")
public class MakerController
{
	@Autowired
	MakerServiceImpl makerServiceImpl;
	
	@RequestMapping("/getSameTagUnmarked")
	@ResponseBody
	public Object getSameTagUnmarked(Integer start,Integer size)
	{
		return makerServiceImpl.selectSameTagUnmarkedRecord(start, size);
	}
	
	@RequestMapping("/getAgeTagUnmarked")
	@ResponseBody
	public Object getAgeTagUnmarked(Integer start,Integer size)
	{
		return makerServiceImpl.selectAgeTagUnmarkedRecord(start, size);
	}

	@RequestMapping("/markSameTagAndHumTag")
	@ResponseBody
	public Object getAgeTagUnmarked(Integer id, Long sameTag, Boolean isHuman)
	{
		return makerServiceImpl.markSameTagAndHumTag(id, sameTag, isHuman);
	}
	
	@RequestMapping("/markAgeTagAndSexTag")
	@ResponseBody
	public Object markAgeTagAndSexTag(Integer id, Integer ageTag, Boolean isMaleTag)
	{
		return makerServiceImpl.markAgeTagAndSexTag(id, ageTag, isMaleTag);
	}
}
