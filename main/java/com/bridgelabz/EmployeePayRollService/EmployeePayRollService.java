package com.bridgelabz.EmployeePayRollService;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeePayRollService {
    public ArrayList<EmployeePayroll> employeePayrollList;


    public EmployeePayRollService(ArrayList<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner input = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(input);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {
        System.out.println("Employee data: " + employeePayrollList);
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
