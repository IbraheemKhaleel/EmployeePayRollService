package com.bridgelabz.EmployeePayRollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeePayRollService {
	public enum IOService {CONSOLE_IO ,FILE_IO, DB_IO, REST_IO } ;
	private List<EmployeePayroll>  employeePayrollList;
	
    public EmployeePayRollService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner input = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(input);
        employeePayrollService.writeEmployeePayrollData(EmployeePayRollService.IOService.CONSOLE_IO);
    }

    public void writeEmployeePayrollData(EmployeePayRollService.IOService ioService) {
    	if(ioService.equals(EmployeePayRollService.IOService.CONSOLE_IO))
    		System.out.println("\n Writing employee pay roll to console \n " + employeePayrollList);
    	else if (ioService.equals(EmployeePayRollService.IOService.FILE_IO))
    		new EmployeePayrollFileIOService().writeData(employeePayrollList);
    }

    private void readEmployeePayrollData(Scanner input) {
        System.out.println("Enter employee id: ");
        int id = input.nextInt();
        System.out.println("Enter employee name: ");
        String name = input.next();
        System.out.println("Enter employee salary: ");
        double salary = input.nextInt();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));

    }

    @Override
    public String toString() {
        return "Writing employee pay roll " +
                "employeePayrollList=" + employeePayrollList +
                '}';
    }
}
