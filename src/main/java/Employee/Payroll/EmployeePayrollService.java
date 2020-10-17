/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Employee.Payroll;

import java.util.*;

public class EmployeePayrollService {
	
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}
	
    public List<EmployeePayrollData> employeePayrollList;
    
    public EmployeePayrollService() {
    	
    }
    
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
    	this.employeePayrollList = employeePayrollList;
    }
    
    public void readEmployeePayrollData(Scanner sc) {
    	System.out.println("Enter Employee Name : ");
    	String name = sc.nextLine();
    	System.out.println("Enter Employee ID : ");
    	int id = sc.nextInt();
    	System.out.println("Enter Employee Salary : ");
    	double salary = sc.nextDouble();
    	employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }
    
    public void writeEmployeePayrollData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO))
			System.out.println("\nWriting Payroll to Console\n" + employeePayrollList);
		else if (ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeData(employeePayrollList);

    }
    
    public long countEntries(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO))
			return new EmployeePayrollFileIOService().countEntries();
		return 0;
	}
    
    public void printEmployeePayrollData(IOService ioService) {
    	if(ioService.equals(IOService.FILE_IO)) {
    		new EmployeePayrollFileIOService().printData();
    	}
    }
}
