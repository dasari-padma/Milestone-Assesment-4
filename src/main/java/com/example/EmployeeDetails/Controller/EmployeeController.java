package com.example.EmployeeDetails.Controller;

import java.util.ArrayList;

import com.example.EmployeeDetails.Entity.Employee;



public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(1,"Padma",10000));
		al.add(new Employee(2,"Anitha",20000));
		al.add(new Employee(3,"Sujatha",30000));
		al.add(new Employee(4,"Durga",40000));
		al.add(new Employee(5,"Teja",50000));
		al.add(new Employee(6,"Chandana",60000));
		al.add(new Employee(7,"Gayatri",70000));
		al.add(new Employee(8,"Bhanu",80000));
		al.add(new Employee(9,"Indu",90000));
		al.add(new Employee(10,"Narayana",95000));
		
		for(Employee st:al)
			System.out.println(st.toString());

	}

	

}
