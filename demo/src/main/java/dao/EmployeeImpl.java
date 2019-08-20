package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Emp;

public class EmployeeImpl {
    public ArrayList<Emp> GetEmps(Connection connection) throws Exception {
	ArrayList<Emp> empList = new ArrayList<Emp>();
	try {
	    PreparedStatement ps = connection.prepareStatement("SELECT id,sal,name FROM emp ORDER BY id DESC");
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		Emp emp = new Emp();
		emp.setId(rs.getLong("id"));
		emp.setSal(rs.getLong("sal"));
		emp.setName(rs.getString("name"));
		empList.add(emp);
	    }
	    return empList;
	} catch (Exception e) {
	    throw e;
	}
    }

    public Emp GetEmps(Long id) throws Exception {
	 Database database = new Database();
	    Connection connection = database.Get_Connection();
	    Emp emp = new Emp();
	    try {
		    PreparedStatement ps = connection.prepareStatement("SELECT id,sal,name FROM emp where id = ? or sal > ? ");
		    ps.setLong(1, id);
		    ps.setLong(2, 1000);
		    ResultSet rs = ps.executeQuery();
		    while (rs.next()) {
			
			emp.setId(rs.getLong("id"));
			emp.setSal(rs.getLong("sal"));
			emp.setName(rs.getString("name"));
		    }
		    return emp;
		} catch (Exception e) {
		    throw e;
		}
    }

}