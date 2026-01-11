package code_coverage_4.code_coverage_4;

public class targil_3 {

    // פונקציה 1
    public static int func1(int x, int y, int z) {
    int res = 0;

    if ((x != 0) & ((y == 0))) {
        res = z / 10;
    }
    res = res / x;
    return res;
    }


    // פונקציה 2
    public static String func2 (float p, float q) {
        if (p != 0) {
            p = p + 10;
        }
        q = q / p;
        return String.format("p=%.2f, q=%.2f", p, q);
    }

    // פונקציה 3
    public static String func3(int x) {
        int result = 10;
        if (x > 0) {
            result = result / x;
        }
        result = result / 0;
        return String.format("result=%d", result);
    }
} 