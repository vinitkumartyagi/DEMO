package com.programmer.gate;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.Emp;
import model.EmpModel;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @RequestMapping(value = "/empList", method = RequestMethod.GET)
    public ArrayList<Emp> empList() {
	
	 ArrayList<Emp> empList = null;
	try {
	   
	    EmpModel projectManager = new EmpModel();
	    empList = projectManager.getEmps();
	}

	catch (Exception e) {
	    System.out.println("Exception Error"); // Console
	}
	return empList;
    }
    
    @RequestMapping(value = "/getEmp/{id}", method = RequestMethod.GET)
    public Emp getEmpoyee(@PathVariable(value = "id") Long id) {
	
	Emp emp = null;
	try {
	   
	    EmpModel projectManager = new EmpModel();
	    emp = projectManager.getEmps(id);
	}

	catch (Exception e) {
	    System.out.println("Exception Error"); // Console
	}
	return emp;
    }

}
