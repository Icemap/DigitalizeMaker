package com.wqz.dm.service;

import java.util.List;

import com.wqz.dm.pojo2.AllFace;

public interface TaskService
{
	List<Integer> getAllSrcIndex();
	List<Integer> getAllSelfIndex();
	
	List<AllFace> getSrcList(List<Integer> srcIndex);
	Boolean insertToSelf(AllFace allFace);
}
