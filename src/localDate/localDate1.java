package localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class localDate1 {

    static void now() {
        DateTimeFormatter formst1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(formst1.format(localDate));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(format2.format(localTime));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(format3.format(now));

        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(format3.format(now2));
        System.out.println(now2.getOffset());
    }



    public static void main(String[] args) {
        now();
    }

}
