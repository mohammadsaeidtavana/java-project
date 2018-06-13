package controler.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by saeedtavana on 5/19/18.
 */
public class testRunner {
    public static void main(String[] args) {
       Result result=JUnitCore.runClasses(testunit.class);
        for (Failure failure:result.getFailures())
        {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
