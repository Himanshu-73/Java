package DAY15;

import java.time.LocalDateTime;

public class b41 {
    public static void main(String[] args) {
        {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime yesterday = now.minusDays(1);
            now.isAfter(yesterday);
            System.out.println("Sahi baat hai");
        }
    }
}
