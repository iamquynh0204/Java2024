import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][][] arr = new int[3][4][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<4; j++){
                for (int z=0; z<6; z++) {
                    arr[i][j][z] = rd.nextInt();
                }
            }
        }

        int max = arr[0][0][0];
        int min = arr[0][0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<4; j++){
                for (int z=0; z<6; z++) {
                    if (arr[i][j][z] > max){
                        max = arr[i][j][z];
                    }
                    if(arr[i][j][z] < min) {
                        min = arr[i][j][z];
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
