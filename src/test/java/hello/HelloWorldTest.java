package hello;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class HelloWorldTest {
    @Test public void appHasAGreeting() {
        Greeter greeter = new Greeter();
        String testString = "Input";
        assertNotNull("app should have a greeting", greeter.sayHello(testString));
    }
}
