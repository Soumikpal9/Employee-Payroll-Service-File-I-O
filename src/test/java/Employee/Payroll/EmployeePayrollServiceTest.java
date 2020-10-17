/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Employee.Payroll;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;

public class EmployeePayrollServiceTest {
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployees = { 
				new EmployeePayrollData(1, "Soumik Pal", 5000.0),
				new EmployeePayrollData(2, "Donald Dan", 4800.0),
				new EmployeePayrollData(3, "Shreyansh Sinha", 6500.0) };
		EmployeePayrollService employeePayrollService; 
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3, employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO));
	}
}
