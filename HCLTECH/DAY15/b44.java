package DAY15;

import java.time.ZoneId;
import java.util.*;

public class b44 {
    public static void main(String[] args) {
        Set<String> availableZoneids =ZoneId.getAvailableZoneIds();
        // Count of total timezones
        System.out.println("Total Timezones: " + availableZoneids.size());

    }
}
