import org.junit.Assert;
import org.junit.Test;

public class TestProgrammer {
    @Test
    public void TestOfPercentOfWorkedTime()
    {
        Employees employees=new Programmers();


        employees.setHoursWorked(100);
        Assert.assertEquals(50,employees.percentOfWorkedTime());

        employees.setHoursWorked(10);
        Assert.assertEquals(5,employees.percentOfWorkedTime());

        employees.setHoursWorked(0);
        Assert.assertEquals(0,employees.percentOfWorkedTime());

        employees.setHoursWorked(200);
        Assert.assertEquals(100,employees.percentOfWorkedTime());

        employees.setHoursWorked(1000);
        Assert.assertEquals(500,employees.percentOfWorkedTime());

    }


    @Test
    public void TestSalaryForMonth()
    {

        Employees employees=new Programmers();
        employees.setFullSalary(1000);



        employees.setHoursWorked(33);
        Assert.assertEquals( 160,(int)employees.salaryForMonth());

        employees.setHoursWorked(0);
        Assert.assertEquals( 0,(int)employees.salaryForMonth());

        employees.setHoursWorked(300);
        Assert.assertEquals( 1500,(int)employees.salaryForMonth());


        employees.setHoursWorked(100);
        Assert.assertEquals( 500,(int)employees.salaryForMonth());


        employees.setHoursWorked(200);
        Assert.assertEquals( 1000,(int)employees.salaryForMonth());



    }
}