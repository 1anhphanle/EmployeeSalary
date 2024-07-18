package Test;

import org.junit.jupiter.api.Test;

import Lab01_22H4060068.CommissionEmployee;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    @Test
    void testCommissionEmployeeCreation() {
        CommissionEmployee employee = new CommissionEmployee("Anh", "Phan", "567890123", 5000, 0.1);
        assertEquals("Anh", employee.getFirstName());
        assertEquals("Phan", employee.getLastName());
        assertEquals("567890123", employee.getSocialSecurityNumber());
        assertEquals(5000, employee.getGrossSales(), 0.01);
        assertEquals(0.1, employee.getCommissionRate(), 0.01);
    }

    @Test
    void testCommissionEmployeeEarnings() {
        CommissionEmployee employee = new CommissionEmployee("Anh", "Phan", "567890123", 5000, 0.1);
        assertEquals(500, employee.earnings(), 0.01);
    }
}