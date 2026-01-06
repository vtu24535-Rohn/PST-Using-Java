import java.util.*;
public class Arrayaccess {
    public static void main(String[] args) {
        int[] arr={10,23,12,43,5465,76};
        Scanner sn = new Scanner(System.in);
        int n=sn.nextInt();
        if(n>=0 && n<arr.length){
            System.out.println(arr[n]);
            }   
        else{
            System.out.println("Array Index Out of Bound");
        }  
    }
}    

