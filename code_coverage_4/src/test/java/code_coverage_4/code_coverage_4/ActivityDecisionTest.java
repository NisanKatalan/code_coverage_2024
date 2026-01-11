package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ActivityDecisionTest {

@Test
    public void testConstructor() {
        ActivityDecision activity = new ActivityDecision();
        assertEquals(activity != null, true);
    }
    // Case 1: Walking + Midnight + Raining
    @Test
    public void testWalkingMidnightRaining() {
        String result = ActivityDecision.decideActivity(true, true, false, false, true);
        assertEquals("Take umbrella and searchlight", result);
    }

    // Case 2: Walking + Midnight + No Rain
    @Test
    public void testWalkingMidnightNoRain() {
        String result = ActivityDecision.decideActivity(true, true, false, false, false);
        assertEquals("Take searchlight", result);
    }

    // Case 3: Running + Sunshine + Raining
    @Test
    public void testRunningSunshineRaining() {
        String result = ActivityDecision.decideActivity(false, false, true, true, true);
        assertEquals("Take umbrella", result);
    }

    // Case 4: None of the above
    @Test
    public void testDefaultActivity() {
        String result = ActivityDecision.decideActivity(false, false, false, false, false);
        assertEquals("Keep doing what you were doing", result);
    }
}