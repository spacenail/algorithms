public class Exponentiation {
    public static double exp(int basis, int level) {
        if (level < 0) {
            return expNegative(basis, level);
        } else if (level > 0) {
            return expPositive(basis, level);
        } else {
            return 1;
        }
    }

    private static double expPositive(int basis, int level) {
        if (level == 0) { //базовый случай
            return 1;
        }
        return basis * exp(basis, level - 1); //рекурсионный случай
    }

    private static double expNegative(int basis, int level) {
        return 1 / expPositive(basis, level*(-1));
    }
}



