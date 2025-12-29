package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;
import code_coverage_4.code_coverage_4.targil_3;

public class func1_test {

    @Test
    public void T1_ConditionTrueTrue() {
        String result = targil_3.func1(1, 3);
        assertEquals("BIG", result);
    }

    @Test
    public void T2_ConditionTrueFalse() {
        String result = targil_3.func1(1, 2);
        assertEquals("OK", result);
    }

    @Test
    public void T3_ConditionFalseCrash() {
        assertThrows(ArithmeticException.class, () -> {
            targil_3.func1(0, 5);
        });
    }
}