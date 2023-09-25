package com.department;

class HrDepartment extends SuperDepartment{
	static String departmentName() {
		return "HR Department";
	}
	static String doActivity() {
			return "Team Lunch";
	
	}
	static String getTodaysWork() {
		return "Fill out today’s timesheet and mark your attendance";
	}
	static String getWorkDeadline() {
		return "Complete it by EOD";
	}
	
}
