package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class func3_Test {

    @Test
    public void T1_BranchTrue() {
        assertThrows(ArithmeticException.class, () -> {
            targil_3.func3(2);
        });
    }
    @Test
    public void T2_BranchFalse() {
        assertThrows(ArithmeticException.class, () -> {
            targil_3.func3(0);
        });
    }
}