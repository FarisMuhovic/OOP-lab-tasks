package task3;

import java.io.*;
import java.util.Date;

public class Events {
    private static final String[] event_types = {"Login", "Logout", "Purchase", "ViewPage", "Error"};

    public static void generateEventsFile(String filename, int numberofRecords ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < numberofRecords; i++) {
            // event type number
            String event_type = event_types[(int) (Math.random() * event_types.length)];
            int randomUser = (int) (Math.random() * 1000);
            writer.write("Timestamp: " + new Date().getTime() + event_type + "\n");
        }
        writer.close();

    }
    public static void readEventsFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < 5; i++) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "events.txt";
        generateEventsFile(fileName, 1000);
        readEventsFile(fileName);
    }
}
