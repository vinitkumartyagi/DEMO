package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;
import dao.EmployeeImpl;
import dto.Emp;

public class EmpModel {

    public ArrayList<Emp> getEmps() throws Exception {
	ArrayList<Emp> feeds = null;
	try {
	    Database database = new Database();
	    Connection connection = database.Get_Connection();
	    EmployeeImpl project = new EmployeeImpl();
	    feeds = project.GetEmps(connection);
	} catch (Exception e) {
	    throw e;
	}
	return feeds;
    }

    public Emp getEmps(long id) throws Exception {
	Emp emp = null;
	try {
	   
	    EmployeeImpl project = new EmployeeImpl();
	    emp = project.GetEmps(id);
	} catch (Exception e) {
	    throw e;
	}
	return emp;
    }

}