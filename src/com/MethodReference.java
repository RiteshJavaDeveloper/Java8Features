package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface MyInterface {
	public void method1();
}

interface MyNewInterface {
	public void methodForConstructor1(String employeeId, String employeeName, String employeeRole);
}

public class MethodReference {
	
	public static void main(String[] args) {
		
		MyInterface mI = () -> {System.out.println("Trying to learn method references using lambda...");};
		mI.method1();
		MyInterface m = Employee :: method2;
		m.method1();
		
		Employee em = new Employee();
		MyInterface m2 = em :: method3;
		m2.method1();
		
		MyNewInterface m3 = Employee :: new;
		m3.methodForConstructor1("111","Ram","ASE");
		
		
	    new Thread(()-> {/*new Runnable() { @Override {
	    	public void run() {*/
			System.out.println("We are outside run method....");
			System.out.format("This is line no %d\n", 2);}
			
		/*}}*/).start();
	    
	    /*List<Employee> employees = new ArrayList<Employee>();
	    employees.add(new Employee("1603816","Amrita","ASE"));
	    employees.add(new Employee("1338634","Ritesh","SE"));
	    employees.add(new Employee("165324","Sidhartha","AST"));
	    employees.add(new Employee("168381","Rajib","AST"));*/
	    
	    /*Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee employee1, Employee employee2) {
				// TODO Auto-generated method stub
				return employee1.getEmployeeName().compareToIgnoreCase(employee2.getEmployeeName());
			}
		});*/
	   /* Collections.sort(employees, (employee1, employee2) -> employee1.getEmployeeName().compareToIgnoreCase(employee2.getEmployeeName()));
	    employees.forEach((e) -> System.out.println(e.getEmployeeName()));*/
	}
	
	
}

class Employee {
	private String employeeId;
    private String employeeName;
    private String employeeRole;
    
    public Employee() {}
    
    public Employee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		System.out.println(this.employeeId  + "....,,,," + this.employeeName);
	}
	public Employee(String employeeId, String employeeName, String employeeRole) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		System.out.println(this.employeeId  + "....,,,," + this.employeeName+">>>>><<<<"+this.employeeRole);
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
    
    
    public static void method2() {
    	System.out.println("Trying to learn static method references...");
    }
    
    public void method3() {
    	System.out.println("Trying to learn instance method references...");
    }
}

