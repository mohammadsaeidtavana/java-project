package controler.test;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by saeedtavana on 5/19/18.
 */
public class testunit {


    @Test
    public void test2()
    {

        printword printword=new printword();
        printword.setId(12);
        printword.setName("saeed");

        controler.test.printword expect =new printword();
        expect.setName("saeed");
        expect.setId(12);

        //Assert.assertTrue(EqualsBuilder.reflectionEquals(expect,printword));
        Assert.assertTrue(EqualsBuilder.reflectionEquals(expect,printword));
       // Assert.assertEquals("saeed","s");
    }

}
