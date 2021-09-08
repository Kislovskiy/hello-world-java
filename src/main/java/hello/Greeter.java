package hello;

public class Greeter {
    public String sayHello(String[] args) {
        String greeting;
        if(args.length == 0) {
            greeting = "Hello world!";
        } else {
            greeting = "The first argument is: " + args[0];
        }
        return greeting;
    }
}
