import java.time.Duration;
import java.time.LocalDateTime;

public class DurationFormatter {

    public static String formatDuration(int seconds) {

        if (seconds < 0) throw new IllegalArgumentException("seconds must be non-negative.");

        if (seconds == 0) return "now";

        String result = "";
        int[] dividers = new int[] {31536000, 86400, 3600, 60, 1};
        String[] tags = new String[] {"year", "day", "hour", "minute", "second"};

        for (int i = 0; i < 5; i++) {
            if (seconds >= dividers[i]) {
                int j = seconds / dividers[i];
                seconds = seconds % dividers[i];
                result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        + j + " " + tags[i] + (j > 1 ? "s" : "");
            }
        }
        return result;
    }

}
