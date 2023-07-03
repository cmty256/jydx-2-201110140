package com.atguigu.crud.service;

import com.atguigu.crud.bean.WelfareTypeApplication;
import com.atguigu.crud.bean.WelfareTypeApplicationExample;
import com.atguigu.crud.bean.WelfareTypeApplicationExample.Criteria;
import com.atguigu.crud.bean.WelfareTypeApplication;
import com.atguigu.crud.dao.WelfareTypeApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelfareTypeApplicationService {
	
	@Autowired
	WelfareTypeApplicationMapper welfareTypeApplicationMapper;

	/**
	 * 查询所有员工
	 *
	 * @return
	 */
	public List<WelfareTypeApplication> getAll() {
		// TODO Auto-generated method stub
		return welfareTypeApplicationMapper.selectByExample(null);
	}

	/**
	 * 员工保存
	 * @param welfareTypeApplication
	 */
	public void saveEmp(WelfareTypeApplication welfareTypeApplication) {
		// TODO Auto-generated method stub
		welfareTypeApplicationMapper.insertSelective(welfareTypeApplication);
	}


	/**
	 * 按照员工id查询员工
	 * @param id
	 * @return
	 */
	public WelfareTypeApplication getEmp(Integer id) {
		// TODO Auto-generated method stub
		WelfareTypeApplication welfareTypeApplication = welfareTypeApplicationMapper.selectByPrimaryKey(id);
		return welfareTypeApplication;
	}

	/**
	 * 员工更新
	 * @param welfareTypeApplication
	 */
	public void updateEmp(WelfareTypeApplication welfareTypeApplication) {
		// TODO Auto-generated method stub
		welfareTypeApplicationMapper.updateByPrimaryKeySelective(welfareTypeApplication);
	}

	/**
	 * 员工删除
	 * @param id
	 */
	public void deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		welfareTypeApplicationMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		WelfareTypeApplicationExample example = new WelfareTypeApplicationExample();
		Criteria criteria = example.createCriteria();
		//delete from xxx where emp_id in(1,2,3)
		criteria.andEmpIdIn(ids);
		welfareTypeApplicationMapper.deleteByExample(example);
	}

}
