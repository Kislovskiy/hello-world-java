package com.kislovskiy.dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {

    public static ArrayList<LocalDate> printDates(LocalDate targetDate) {
        LocalDate startDate = targetDate.minusDays(7);
        ArrayList<LocalDate> dates = new ArrayList<>();
        for (LocalDate date = startDate; date.isBefore(targetDate.plusDays(1)); date = date.plusDays(1)) {
            dates.add(date);
        }
        return dates;
    }

    public static ArrayList<LocalDateTime> printDateTimes(LocalDateTime targetDate) {
        LocalDateTime startDate = targetDate.minusDays(7);
        ArrayList<LocalDateTime> dates = new ArrayList<LocalDateTime>();
        for (LocalDateTime date = startDate; date.isBefore(targetDate.plusDays(1)); date = date.plusDays(1)) {
            dates.add(date);
        }
        return dates;
    }

    public static LocalDateTime parseDate(String date) throws ParseException {
        return LocalDateTime.parse(date,
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static boolean compareDate(LocalDateTime dateTimeA, LocalDateTime dateTimeB) {
        return dateTimeA.isBefore(dateTimeB);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("printDates()");
        ArrayList<LocalDate> dates = printDates(LocalDate.of(2021, 10, 4));
        System.out.println(dates);

        System.out.println("printDateTimes()");
        LocalDateTime targetDate = LocalDateTime.of(2021, 10, 4, 0, 0, 0);
        ArrayList<LocalDateTime> dateTimes = printDateTimes(targetDate);
        System.out.println(dateTimes);

        System.out.println("\nparseDate()");
        System.out.println(parseDate("2021-10-04 00:00:00"));

        System.out.println("\ncompareDate()");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate = LocalDateTime.parse("2021-10-04 20:00:00", formatter);
        System.out.println("parsedDate: " + parsedDate);

        LocalDate targedDate = LocalDate.of(2021, 10, 10);
        LocalDateTime targetDateTime = targedDate.atStartOfDay();
        System.out.println("targetDateTime: " + targetDateTime);
        System.out.println("parsedDate < targetDateTime: " + compareDate(parsedDate, targetDateTime));
    }
}
