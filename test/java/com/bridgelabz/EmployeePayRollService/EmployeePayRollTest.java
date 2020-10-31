package com.bridgelabz.EmployeePayRollService;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class EmployeePayRollTest {
	@Test
	public void given3Employees_WhenWrittenToFile_ShowMatchEmployeeEntries( ) {
		EmployeePayroll [] arrayofEmps = {	
										new EmployeePayroll(1, "jake" , 12000), 
										new EmployeePayroll(2, "Swami", 52000), 
										new EmployeePayroll(3, "life", 65892)};
		EmployeePayRollService employeePayrollService  ;
		employeePayrollService = new EmployeePayRollService(Arrays.asList(arrayofEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayRollService.IOService.FILE_IO);
		employeePayrollService.printData(EmployeePayRollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayRollService.IOService.FILE_IO);
        Assert.assertEquals(3 , entries);
	}

}
