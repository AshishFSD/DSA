import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int newNum= num-1;

         for(int i=1; i<=num ;i++){
             // Above for loop for row

              for(int j =newNum; j>i ; j--){

                  System.out.print("-");
              }

              for(int k=1; k<i ;k++){
                  System.out.print("+");
              }
             System.out.println(" ");
         }


    }

}
