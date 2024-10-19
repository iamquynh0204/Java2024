public class Exercise18 {
    public static void main(String[] args) {
//        hinh m
        for (int i = 1; i <= 8; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("=======================");

//        hinh n
        for (int i = 8; i > 0; i--) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println("=======================");
//        hinh o
        for (int i = 0; i <= 8; i++) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println("=======================");
//        hinh p
        for (int i = 8; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("===================================");

//        hinh q

        for (int i = 0; i <= 8; i++) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+1 + " ");
            }
            for (int j = i; j > 1; --j) {
                System.out.print(j-1 + " ");
            }
            System.out.println();
        }

        System.out.println("======================================");
//        hinh r
        for (int i = 8; i > 0; i--) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+1 + " ");
            }
            for (int j = i; j > 1; --j) {
                System.out.print(j-1 + " ");
            }

            System.out.println();
        }

        System.out.println("=================================");
//        hinh s

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 4*(8-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; --j) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("Khong bo duoc so 8 kia");
//        hinh t
        System.out.println("Chiu");
//        hinh u
        System.out.println("Chiu");

    }
}
