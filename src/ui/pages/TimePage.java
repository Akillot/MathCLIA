package ui.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static ui.layout.TextWork.contentAlignment;


public class TimePage {
    public static void displayCurrentTime() {
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern(contentAlignment(10) + "\ndd-MM-yyyy"
                + contentAlignment(5) + "\nHH:mm");
        String formattedTime = localTime.format(myFormatter);
        System.out.println(contentAlignment(9) + "Time is: " + formattedTime);
    }

}
