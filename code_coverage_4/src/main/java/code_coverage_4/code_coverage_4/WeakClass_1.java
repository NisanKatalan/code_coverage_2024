package code_coverage_4.code_coverage_4;

public class WeakClass_1 {

    public int weakMethod1(int x, int y) {
        int res = 0;
        if (x != 0 || y / x > 5) {
            res = 1;
        }
        return res;
    }
}