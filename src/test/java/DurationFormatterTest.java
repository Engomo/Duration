import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationFormatterTest {

    @Test
    public void exampleTests() {
        assertEquals("1 second", DurationFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", DurationFormatter.formatDuration(62));
        assertEquals("1 hour, 1 minute and 2 seconds", DurationFormatter.formatDuration(3662));
        assertEquals("5 years", DurationFormatter.formatDuration(157680000));
        assertEquals("now", DurationFormatter.formatDuration(0));
    }

    @Test
    public void exampleTestsWithNegative() {
        assertThrows(IllegalArgumentException.class, ()-> DurationFormatter.formatDuration(-5));
    }

}