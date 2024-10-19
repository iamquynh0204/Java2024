public class Exercise19 {
    public static void main(String[] args) {
//        a
        int x = 8;
        int rowCount = 1;
        for (int i = x; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= rowCount - 1; j++) {
                System.out.printf("%2d", (int) Math.pow(2, j));
            }

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.printf("%2d", (int) Math.pow(2, j - 1));
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("======================");
//        b
        for (int i = 0; i < 7; i++)
        {

            for (int j = 0; j <= i; j++)
                System.out.print(binomialCoeff(i, j)+" ");
            System.out.println();
        }
        System.out.println("======================");
//        c
        for (int i = 0; i < 7; i++) {
            int number = 1;
            System.out.printf("%" + (7 - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
