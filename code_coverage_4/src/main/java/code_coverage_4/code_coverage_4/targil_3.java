package code_coverage_4;


public class targil_3 {

    // פונקציה 1
    public static String func1(int a, int b) {
        String res = "OK";
        if (a != 0 & (b / a) > 2) {
            res = "BIG";
        }
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