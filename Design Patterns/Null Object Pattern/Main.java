// Step 5: Main method to test both scenarios
public class Main {
    public static void main(String[] args) {
        Logger realLogger = new ConsoleLogger();
        Logger nullLogger = new NullLogger();

        System.out.println("=== With Real Logger ===");
        Application app1 = new Application(realLogger);
        app1.run();

        System.out.println("\n=== With Null Logger ===");
        Application app2 = new Application(nullLogger);
        app2.run(); // No output, but safe
    }
}
