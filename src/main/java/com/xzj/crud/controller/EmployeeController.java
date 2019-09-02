package com.xzj.crud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzj.crud.bean.Employee;
import com.xzj.crud.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//在查询之前只需要调用,传入页码,已经每页大大小
		PageHelper.startPage(pn, 5);
		//stattPage后面紧跟的查询语句就是一个分页查询
		List<Employee> emps = employeeService.getAll();
		PageInfo pahe = new PageInfo(emps,5);
		model.addAttribute("pageInfo", pahe);
		return "list";
	} 

}
