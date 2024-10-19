public class Exercise17 {
    public static void main(String[] args) {
//        hinh a
        for (int i = 1; i <= 8; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("========================");

//        hinh b
        for (int i = 8; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("========================");

//        hinh c

        for (int i = 8; i > 0; i--) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("========================");

//        hinh d

        for (int i = 0; i <= 8; i++) {
            for (int j = 2 * (8 - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("========================");

//    hinh e

        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if(i==0 && j<7 || i==6 && j<7 || j==0 && i<7 || j==6 && i<7) {
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("========================");

//    hinh f

        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if(i==0 && j<7 || i==6 && j<7){
                    System.out.print("# ");
                }

                else if(i==j){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("========================");


//    hinh g

        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if(i==0 && j<7 || i==6 && j<7){
                    System.out.print("# ");
                }

                else if(i+j == 6){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("========================");


//    hinh h

        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if(i==0 && j<7 || i==6 && j<7){
                    System.out.print("# ");
                }
                else if(i+j == 6){
                    System.out.print("# ");
                }
                else if(i==j) {
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("========================");

//    hinh i
        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if(i==0 && j<7 || i==6 && j<7){
                    System.out.print("# ");
                }
                else if(i==0 && j<7 || i==6 && j<7 || j==0 && i<7 || j==6 && i<7) {
                    System.out.print("# ");
                }
                else if(i+j == 6){
                    System.out.print("# ");
                }
                else if(i==j) {
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("========================");

//    hinh j

        for(int i = 6; i >= 1; --i) {
            for(int space = 1; space <= 6 - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2*i-1; ++j) {
                System.out.print("# ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("# ");
            }

            System.out.println();
        }

        System.out.println("=============================");

//    hinh k
        int k=0;
        for (int i = 1; i <= 6; ++i, k = 0) {
            for (int space = 1; space <= 6 - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("# ");
                ++k;
            }

            System.out.println();
        }

        System.out.println("=============================");

//    hinh l

        for (int i = 1; i <= 6; ++i, k = 0) {
            for (int space = 1; space <= 6 - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("# ");
                ++k;
            }

            System.out.println();
        }

        for(int i = 5; i >= 1; --i) {
            for(int space = 1; space <= 6 - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2*i-1; ++j) {
                System.out.print("# ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("# ");
            }

            System.out.println();
        }

    }
}


