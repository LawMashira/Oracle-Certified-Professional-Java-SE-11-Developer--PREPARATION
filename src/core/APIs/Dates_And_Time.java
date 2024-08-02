package core.APIs;

import java.time.*;

public class Dates_And_Time
{
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalTime.now());
//        System.out.println(ZonedDateTime.now());

//
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);//2022-01-20
//        System.out.println(date1);
//        var date2 = LocalDate.of(2022, 1, 20);//2022-01-20
//        System.out.println(date2);
       var time1 = LocalTime.of(6, 15);// hour and minute
//        System.out.println(time1);
//        var time2 = LocalTime.of(6, 15, 30);           // + seconds
//        System.out.println(time2);
//        var time3 = LocalTime.of(6, 15, 30, 200);
//        System.out.println(time3);
//        // You can combine dates and times into one object
//
      var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
//        System.out.println(dateTime1);
//        var dateTime2 = LocalDateTime.of(date1, time1);
//        System.out.println(dateTime2);

        // In order to create a ZonedDateTime, we first need to get the desired time zone. We will
        //use US/Eastern in our examples:
        //var zone = ZoneId.of("US/Eastern");
      //  var zoned1 = ZonedDateTime.of(2022, 1, 20,
             //   6, 15, 30, 200, zone);
//        System.out.println(zoned1);
//        var zoned2 = ZonedDateTime.of(date1, time1, zone);
//        System.out.println(zoned2);
//        var zoned3 = ZonedDateTime.of(dateTime1, zone);
//        System.out.println(zoned3);
//        var date = LocalDate.of(2022, Month.JANUARY, 20);
//         System.out.println(date);    // 2022–01–20
//         date = date.plusDays(2);
//         System.out.println(date);    // 2022–01–22
//         date = date.plusWeeks(2);
//        System.out.println(date);    // 2022–01–29
//         date = date.plusMonths(1);
//         System.out.println(date);    // 2022–02–28
//         date = date.plusYears(7);
//         System.out.println(date);    // 2027–02–28

        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);  // 2022–03-13T01:30-05:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 1
        System.out.println(dateTime.getOffset()); // - 05:00
        dateTime = dateTime.plusHours(2);
        System.out.println(dateTime);  // 2022–03-13T03:30-04:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 3
        System.out.println(dateTime.getOffset()); // - 04:00

    }
}
