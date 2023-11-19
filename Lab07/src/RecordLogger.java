public record RecordLogger(String logger) implements Logger {
    public void logMessage(String message) {
        System.out.println(logger + ' ' + message);
    }
}
