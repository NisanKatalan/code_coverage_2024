package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeakClass_1_Test {
	WeakClass_1 tester = new WeakClass_1();

    @Test
    public void testStatementCoverage() {
        int result = tester.weakMethod1(1, 10);
        assertEquals(1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testBranchCoverage() {
        tester.weakMethod1(0, 10);
    }
}
