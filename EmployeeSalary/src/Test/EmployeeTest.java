package Test;

import org.junit.jupiter.api.Test;

import Lab01_22H4060068.Employee;
import Lab01_22H4060068.SalariedEmployee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testEmployeeCreation() {
        Employee employee = new SalariedEmployee("Anh", "Phan", "123456789", 1000);
        assertEquals("Anh", employee.getFirstName());
        assertEquals("Phan", employee.getLastName());
        assertEquals("123456789", employee.getSocialSecurityNumber());
    }
}