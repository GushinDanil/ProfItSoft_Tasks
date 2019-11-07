import org.junit.Test;
import org.junit.Assert;

public class TestManager {
@Test
    public void TestOfPercentOfWorkedTime()
{
    Employees employees=new Managers();


    employees.setHoursWorked(100);
    Assert.assertEquals(100,employees.percentOfWorkedTime());

    employees.setHoursWorked(5);
    Assert.assertEquals(5,employees.percentOfWorkedTime());

    employees.setHoursWorked(1);
    Assert.assertEquals(1,employees.percentOfWorkedTime());

    employees.setHoursWorked(200);
    Assert.assertEquals(100,employees.percentOfWorkedTime());

    employees.setHoursWorked(10000);
    Assert.assertEquals(100,employees.percentOfWorkedTime());

    employees.setHoursWorked(0);
    Assert.assertEquals(0,employees.percentOfWorkedTime());



}

    @Test
    public void TestSalaryForMonth()
    {
        Employees employees=new Managers();
        employees.setFullSalary(1000);



        employees.setHoursWorked(23);
        Assert.assertEquals( 230,(int)employees.salaryForMonth());

        employees.setHoursWorked(0);
        Assert.assertEquals( 0,(int)employees.salaryForMonth());

        employees.setHoursWorked(300);
        Assert.assertEquals( 1000,(int)employees.salaryForMonth());


        employees.setHoursWorked(1);
        Assert.assertEquals( 10,(int)employees.salaryForMonth());

        employees.setHoursWorked(81);
        Assert.assertEquals( 810,(int)employees.salaryForMonth());


        employees.setFullSalary(10);
        employees.setHoursWorked(80);
        Assert.assertEquals( 8,(int)employees.salaryForMonth());



    }
}
