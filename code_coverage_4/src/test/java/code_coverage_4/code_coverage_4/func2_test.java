package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class func2_Test {

    @Test
    public void T1_BranchTrue() {
        String result = targil_3.func2(1.0f, 11.0f);
        assertEquals("p=11.00, q=1.00", result);
    }

    @Test
    public void T2_BranchFalse() {
        String result = targil_3.func2(0.0f, 5.0f);
        assertTrue(result.contains("Infinity"));
    }
}