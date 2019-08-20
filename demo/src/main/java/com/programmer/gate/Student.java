package com.programmer.gate;

import java.util.Map;
import java.util.TreeMap;

public class Student {
    
    private int id;
    private String fName;
    private String lName;
    private String fatherName;
    private String className;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    
public Student populate(int id) {
    Student student123 = new Student();
    student123.setId(123);
    student123.setfName("Test 123 FName");
    student123.setlName("Test 123 LName");
    
    Student student456 = new Student();
    student456.setId(456);
    student456.setfName("Test 456 FName");
    student456.setlName("Test 456 LName");
    
    Map<Integer, Student> mapStudent = new TreeMap<Integer, Student>();
    mapStudent.put(123, student123);
    mapStudent.put(456, student456);
    
    return mapStudent.get(id);
    
}
}
