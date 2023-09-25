package com.department;

public class Main{
	 public static void main(String[] args) {
		 	
			
	        AdminDepartment obj1 = new AdminDepartment();
	        System.out.println("Welcome to the " + obj1.departmentName());
	        System.out.println(obj1.getTodaysWork());
	        System.out.println(obj1.getWorkDeadline());
	        System.out.println(obj1.isTodayAHoliday());
	        
	        System.out.println();
	        
	        HrDepartment obj2 = new HrDepartment();
	        System.out.println("Welcome to the " + obj2.departmentName());
	        System.out.println(obj2.doActivity());
	        System.out.println(obj2.getTodaysWork());
	        System.out.println(obj2.getWorkDeadline());
	        System.out.println(obj2.isTodayAHoliday());
	        
	        System.out.println();
	        
	        TechDepartment obj3 = new TechDepartment();
	        System.out.println("Welcome to  the " + obj3.departmentName());
	        System.out.println(obj3.getTodaysWork());
	        System.out.println(obj3.getWorkDeadline());
	        System.out.println(obj3.getTechStackInformation());
	        System.out.println(obj3.isTodayAHoliday());
	    }
}
