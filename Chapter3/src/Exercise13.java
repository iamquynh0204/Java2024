public class Exercise13 {
    public static void main(String[] args) {
        for(int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*  ");
            }
            for(int j = 1; j <= 3-i; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k <= 2*i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
//        for(int i = 1; i < 4; i++) {
//            for(int j = 1; j <= 4-i; j++) {
//                System.out.print("  ");
//            }
//            for(int k = 1; k <= 2*i-1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
    }
}
