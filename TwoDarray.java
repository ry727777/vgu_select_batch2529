import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] marks = new double[5][4];

        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                marks[i][j] = sc.nextDouble();
            }
        }
    }
} 
