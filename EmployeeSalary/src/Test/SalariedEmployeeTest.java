package Test;

import org.junit.jupiter.api.Test;

import Lab01_22H4060068.SalariedEmployee;

import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {
    @Test
    void testSalariedEmployeeCreation() {
        SalariedEmployee employee = new SalariedEmployee("Anh", "Phan", "987654321", 1500);
        assertEquals("Anh", employee.getFirstName());
        assertEquals("Phan", employee.getLastName());
        assertEquals("987654321", employee.getSocialSecurityNumber());
        assertEquals(1500, employee.getWeeklySalary(), 0.01);
    }

    @Test
    void testSalariedEmployeeEarnings() {
        SalariedEmployee employee = new SalariedEmployee("Anh", "Phan", "987654321", 1500);
        assertEquals(1500, employee.earnings(), 0.01);
    }
}