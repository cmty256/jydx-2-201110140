package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.WelfareType;
import com.atguigu.crud.service.DepartmentService;
import com.atguigu.crud.service.WelfareTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理和部门有关的请求
 *
 */
@Controller
public class WelfareTypeController {
	
	@Autowired
	private WelfareTypeService welfareTypeService;
	
	/**
	 * 返回所有的类别信息
	 */
	@RequestMapping("/types")
	@ResponseBody
	public Msg getTypes(){
		//查出的所有部门信息
		List<WelfareType> list = welfareTypeService.getDepts();
		return Msg.success().add("types", list);
	}

}
