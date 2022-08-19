import java.util.Scanner;

public class LearningDSA {

    public static void  main(String[] args){

        Scanner in= new Scanner(System.in);
        System.out.println("Please enter the number");
         int num = in.nextInt();


         //first for loop that will print
        // first part of pattern
         for( int i=1; i<= num ;i++){
              for(int j=1 ; j<=i; j++){
                  System.out.print("*");
              }
              System.out.println(" ");
         }
         /*
          ==== Result of first Loops ===
          *
          **
          ***
          ****
          *****
          */

        for( int i=1; i<= num ;i++){
            for(int j=i ; j<num; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        /*
        ===== Result of Second loops=====
        ****
        ***
        **
        *
  */
    }
}
