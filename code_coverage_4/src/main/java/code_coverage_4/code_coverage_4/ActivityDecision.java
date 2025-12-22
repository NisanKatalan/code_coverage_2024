package code_coverage_4.code_coverage_4;
public class ActivityDecision {

    public static String decideActivity(boolean walking, boolean midnight, boolean running, boolean sunshine, boolean raining) {

        // Case 1: Walking at midnight
        if (walking && midnight) {
            if (raining) {
                return "Take umbrella and searchlight";
            } else {
                return "Take searchlight";
            }
        }
        // Case 2: Running in sunshine
        else if (running && sunshine) {
            if (raining) {
                return "Take umbrella";
            }
        }
        // Default: Any other scenario
        return "Keep doing what you were doing";
    }
}
        

    
