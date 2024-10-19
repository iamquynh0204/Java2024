public class PrintPattern {
    public static void main(String[] args) {
        int size = 8;
        for (int row = 1; row <= size; row++) {
            for (int col = row; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
