package Test;

import org.junit.jupiter.api.Test;

import Lab01_22H4060068.BasePlusCommissionEmployee;

import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {
    @Test
    void testBasePlusCommissionEmployeeCreation() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Anh", "Phan", "456789012",
                3000, 0.15, 1000);
        assertEquals("Anh", employee.getFirstName());
        assertEquals("Phan", employee.getLastName());
        assertEquals("456789012", employee.getSocialSecurityNumber());
        assertEquals(3000, employee.getGrossSales(), 0.01);
        assertEquals(0.15, employee.getCommissionRate(), 0.01);
        assertEquals(1000, employee.getBaseSalary(), 0.01);
    }

    @Test
    void testBasePlusCommissionEmployeeEarnings() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Anh", "Phan", "456789012",
                3000, 0.15, 1000);
        assertEquals(1450, employee.earnings(), 0.01); // 1000 + (3000 * 0.15)
    }
}