package com.atguigu.crud.service;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.WelfareType;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.WelfareTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelfareTypeService {
	
	@Autowired
	private WelfareTypeMapper welfareTypeMapper;

	public List<WelfareType> getDepts() {
		// TODO Auto-generated method stub
		List<WelfareType> list = welfareTypeMapper.selectByExample(null);
		return list;
	}

}
