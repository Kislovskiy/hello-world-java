package hello;

public class Greeter {
    public String sayHello(String stringToPrint) {
        String greeting;
        if(stringToPrint != null) {
            greeting = "Hello world!";
        } else {
            greeting = "The argument is: " + stringToPrint;
        }
        return greeting;
    }
}
