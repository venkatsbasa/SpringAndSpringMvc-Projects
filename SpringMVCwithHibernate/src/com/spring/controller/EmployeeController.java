package com.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.EmployeeBean;
import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") EmployeeBean employeeBean, 
			BindingResult result) {
		Employee employee = prepareModel(employeeBean);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("employeesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		employeeService.deleteEmployee(prepareModel(employeeBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", null);
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getEmpId())));
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	private Employee prepareModel(EmployeeBean employeeBean){
		Employee employee = new Employee();
		employee.setEmpId(employeeBean.getEmpId());
		employee.setEmpName(employeeBean.getEmpName());
		employee.setEmpGender(employeeBean.getEmpGender());
		employee.setEmpEmail(employeeBean.getEmpEmail());
		employeeBean.setEmpId(0);
		return employee;
	}
	
	private List<EmployeeBean> prepareListofBean(List<Employee> employees){
		List<EmployeeBean> beans = null;
		if(employees != null && !employees.isEmpty()){
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			for(Employee employee : employees){
				bean = new EmployeeBean();
				bean.setEmpId(employee.getEmpId());
				bean.setEmpName(employee.getEmpName());
				bean.setEmpGender(employee.getEmpGender());
				bean.setEmpEmail(employee.getEmpEmail());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private EmployeeBean prepareEmployeeBean(Employee employee){
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpId(employee.getEmpId());
		bean.setEmpName(employee.getEmpName());
		bean.setEmpGender(employee.getEmpGender());
		bean.setEmpEmail(employee.getEmpEmail());
		return bean;
	}
}
