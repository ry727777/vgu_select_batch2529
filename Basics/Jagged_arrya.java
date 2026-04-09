package Basics;
import java.util.Scanner;

public class Jagged_arrya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of class: ");
        int row = sc.nextInt();
        int[][] class_room = new int[row][];

        for(int i=0; i<row; i++){
            System.out.print("Number of student in class: "+(i+1)+ " ");
            int stude = sc.nextInt();
            class_room[i] = new int[stude];
        }

        // input in jagged array
        for(int i=0; i<row; i++){
            for(int j=0; j<class_room[i].length; j++){
                class_room[i][j] = sc.nextInt();
            }
        }

        // calculate avg CGPA

    }
    
}
