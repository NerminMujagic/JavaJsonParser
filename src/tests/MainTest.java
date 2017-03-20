package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by nermin on 19/03/2017.
 */
public class MainTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JsonDataFilterTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
