package hello;

<<<<<<< HEAD
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.ParserProperties;

public class HelloWorld {
    public static void main(String[] argv) {
        final Args args = new Args();
        CmdLineParser parser = new CmdLineParser(args, ParserProperties.defaults().withUsageWidth(100));

        try {
            parser.parseArgument(argv);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
            System.exit(-1);
        }
=======
import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
>>>>>>> main

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello(args));
    }

    private static final class Args {
        @Option(name = "-i",
            aliases = "--input",
            required = true,
            usage = "a String to print to systemOut"
        )
        String inputString;
    }
}
