// Step 4: Client class that uses Logger
class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.log("Application started");
        // Business logic...
        logger.log("Application finished");
    }
}

