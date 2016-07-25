package Simple.humanReadableTime.java;

import java.util.concurrent.TimeUnit;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        long hh = TimeUnit.SECONDS.toHours(seconds);
        long mm = TimeUnit.SECONDS.toMinutes(seconds - TimeUnit.HOURS.toSeconds(hh));
        long ss = TimeUnit.SECONDS.toSeconds(seconds - TimeUnit.MINUTES.toSeconds(mm) - TimeUnit.HOURS.toSeconds(hh));
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    // public static String makeReadable(int seconds) {
    //     return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    // }

}
