package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;


public class func1_Test { //לכיסוי תנאים מלא וזיהוי שגיאת חלוקה באפס

    @Test 
    public void testConditionCoverage_T1() {
        assertEquals(2, targil_3.func1(1, 0, 20));
    }

    @Test
    public void testConditionCoverage_T2() {
        assertThrows(ArithmeticException.class, () -> {
            targil_3.func1(0, 1, 10);
        });
    }
    @Test
public void testConstructor() {
    new targil_3(); 
}
} 