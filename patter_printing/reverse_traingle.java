package patter_printing;

public class reverse_traingle {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){

            // space print
            for(int k=1; k<=i-1; k++){
                System.out.print(" ");
            }

            // star print
            for(int j= 1; j<=5-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
