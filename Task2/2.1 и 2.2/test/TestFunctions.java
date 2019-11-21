import org.junit.Assert;
import org.junit.Test;

public class TestFunctions {
    @Test
    public void TestStar()
    {



        Assert.assertEquals("h*e*ll*o",new Functions().Star("hello"));

        Assert.assertEquals("h*e*a*l*o",new Functions().Star("healo"));

        Assert.assertEquals("a*bc",new Functions().Star("abc"));

        Assert.assertEquals("o*a*b",new Functions().Star("oab"));









    }
    @Test
    public void TestEncoding()
    {
        Assert.assertEquals("00 0 0 0 00 000 0 000",new Functions().Encoding('G'));

        Assert.assertEquals("00 0 0 0 00 0000 0 00",new Functions().Encoding('C'));

        Assert.assertEquals("00 0 0 0 00 00000 0 0",new Functions().Encoding('A'));
    }

}
