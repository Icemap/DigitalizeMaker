package com.wqz.dm.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wqz.dm.dao.AllFaceTagMapper;
import com.wqz.dm.dao2.AllFaceMapper;
import com.wqz.dm.pojo.AllFaceTag;
import com.wqz.dm.pojo2.AllFace;
import com.wqz.dm.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService
{
	@Autowired
	AllFaceMapper allFaceMapper;
	
	@Autowired
	AllFaceTagMapper allFaceTagMapper;

	@PostConstruct
	public void startTask()
	{
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
                public void run()
                {
                        updateData();
                }
        }, 0, 60 * 60 * 1000);//1h sync once
	}
	
	private void updateData()
	{
		List<Integer> srcIndex = getAllSrcIndex();
		List<Integer> selfIndex = getAllSelfIndex();
		
		for (Iterator<Integer> iter = srcIndex.iterator(); iter.hasNext();) 
		{
			Integer srcIndexItem = iter.next();
			if(selfIndex.contains(srcIndexItem))
				iter.remove();
		}
		
		if(srcIndex == null || srcIndex.isEmpty())
			return;
		
		List<AllFace> data = getSrcList(srcIndex);
		for(int i = 0; i < data.size();i++)
		{
			insertToSelf(data.get(i));
		}
	}
	
	@Override
	@Transactional(value = "srcTransactionManager", rollbackFor = Exception.class)
	public List<Integer> getAllSrcIndex()
	{
		return allFaceMapper.selectAllId();
	}

	@Override
	@Transactional(value = "selfTransactionManager", rollbackFor = Exception.class)
	public List<Integer> getAllSelfIndex()
	{
		return allFaceTagMapper.selectAllId();
	}

	@Override
	@Transactional(value = "srcTransactionManager", rollbackFor = Exception.class)
	public List<AllFace> getSrcList(List<Integer> srcIndex)
	{
		return allFaceMapper.selectByIds(srcIndex);
	}

	@Override
	@Transactional(value = "selfTransactionManager", rollbackFor = Exception.class)
	public Boolean insertToSelf(AllFace allFace)
	{
		return allFaceTagMapper.insertSelective(new AllFaceTag(allFace)) == 1;
	}
}
