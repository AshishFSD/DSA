public class Bubblesort {


     public static void main(String[] args){

          int[] arr = {12,4,60,0,12,45,98};


           for(int i=0; i<arr.length-i; i++){
               // This  loops is for number of  comparison
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j]>arr[j+1]){
                         int tem= arr[j];
                         arr[j]= arr[j+1];
                         arr[j+1] =tem;
                    }
                }



           }

           //=========== this is for looping the array=========

         for(int k=0; k< arr.length; k++){
             System.out.println(arr[k]);
         }
     }
}
