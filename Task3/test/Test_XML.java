import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test_XML {
@Test
    public void testDecoding()
{
    XML xml=new XML();
    List<Employees> list =new ArrayList<Employees>() ;
    Employees a =new Managers() ;
    Employees b =new Programmers() ;
    b.setFullSalary(999);
    b.setHoursWorked(33);
    a.setHoursWorked(12);
    a.setFullSalary(700);


    list.add(b);
    list.add(a);

    xml.setList(list);
    xml.Encoding();
    List<Employees> e= (List<Employees> ) xml.Decoding();
/**
 * Проверяю что все данные корректно сохранились
 */
        Assert.assertEquals(b.getHoursWorked(),e.get(0).getHoursWorked());
        Assert.assertEquals(b.getFullSalary(),e.get(0).getFullSalary());


    Assert.assertEquals(a.getHoursWorked(),e.get(1).getHoursWorked());
    Assert.assertEquals(a.getFullSalary(),e.get(1).getFullSalary());



}


}
