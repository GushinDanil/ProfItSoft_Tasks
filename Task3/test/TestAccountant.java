import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestAccountant {

    @Test
    public void TestOfSumSalaryOfMonth()
    {
        Employees p1=new Programmers();
        Employees m1=new Managers();

        ArrayList<Employees> employees=new ArrayList<Employees>();
        employees.add(p1);
        employees.add(m1);
        Accountant accountant =new Accountant();
        accountant.sumSalaryOfMonth(employees);

        Assert.assertEquals(0,accountant.sumSalaryOfMonth(employees));
        p1.setHoursWorked(100);
        p1.setFullSalary(1000);
        m1.setHoursWorked(50);
        m1.setFullSalary(10);


        Assert.assertEquals(505,accountant.sumSalaryOfMonth(employees));
        m1.setHoursWorked(100);
        p1.setHoursWorked(200);


        Assert.assertEquals(1010,accountant.sumSalaryOfMonth(employees));


        p1.setHoursWorked(150);
        Assert.assertEquals(760,accountant.sumSalaryOfMonth(employees));



        m1.setFullSalary(500);
        m1.setHoursWorked(12);
        Assert.assertEquals( 810, accountant.sumSalaryOfMonth(employees));



        m1.setHoursWorked(70);
        Assert.assertEquals( 1100, accountant.sumSalaryOfMonth(employees));

    }
}
