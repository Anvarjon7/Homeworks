package de.telran.module_1.lesson_1.module_1.lesson_1.homework20;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SimpleDateTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " - is leap year");
        } else {
            System.out.println(year + " - is not leap year");
        }

//    2) вывести на консоль дату локализованную для Индии (например)
        Locale locale = Locale.forLanguageTag("uz");
        Locale.setDefault(locale);
        Date date = new Date();
        String stringDate = String.format(locale, "%tc\n", date);
        System.out.println(stringDate);


//    3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.ERA,GregorianCalendar.AD);
        DateFormat df = new SimpleDateFormat("dd-MM-yy,GG,d,D,HH:mm:ss:S");
        System.out.println(df.format(calendar.getTime()));

//    4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2001,Calendar.OCTOBER,10);
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM y");
        System.out.println("My birthday is on: " + dateFormat.format(gregorianCalendar.getTime()));

//    5) проверить дата "10 Января 1985" - это пятница?
        LocalDate checkDayOfWeek = LocalDate.of(1985,1,10);
        DayOfWeek dayOfWeek = checkDayOfWeek.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.FRIDAY){
            System.out.println("10 Января 1985 года было пятницей");
        }else {
            System.out.println("10 Января 1985 года не было пятницей");
        }

//    6) вычесть 10 лет из созданной даты, вывести на консоль
        Calendar calendar2 = new GregorianCalendar(2024,Calendar.JANUARY,1);
        System.out.println(calendar2.getTime());
        calendar2.add(Calendar.YEAR, -10);
        System.out.println(calendar2.getTime());

//    7) получить обьект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        String dateForm = "2022-12-19T06:55:30.00Z";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_INSTANT;
        Instant instant = Instant.from(timeFormatter.parse(dateForm));
        System.out.println("Instant -> " + instant);

//     8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);
        System.out.println("ZonedDateTime in Pacific/Midway: " + dateTime);


    }

//     1) реализовать метод, который принимает год и проверяет на высокосность
    private static boolean isLeapYear(int year){
        return (year % 4 == 0) && ((year % 100 != 0 ) || (year % 400 == 0));
    }
}
