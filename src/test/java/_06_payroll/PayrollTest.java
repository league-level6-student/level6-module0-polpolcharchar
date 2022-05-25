package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hWage = 15.7;
    	int hours = 8;
    	double expected = hWage * hours;
        //when
    	double actual = payroll.calculatePaycheck(hWage, hours);
        //then
    	assertEquals(expected, actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int miles = 163;
    	double expected = 163 * 0.575;
        //when
    	double actual = payroll.calculateMileageReimbursement(miles);
        //then
    	assertEquals(expected, actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String name = "Jack";
    	double wage = 999.99;
    	String expected = "Hello Jack, We are pleased to offer you an hourly wage of 999.99";
        //when
    	String actual = payroll.createOfferLetter(name, wage);
        //then
    	assertEquals(expected, actual);
    }

}