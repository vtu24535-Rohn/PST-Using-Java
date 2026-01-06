import java.util.*;

public class ksmallest{
    public static void main(String[] args) {
        int arr[] = {122,213,12,243,5,21,3,1};
        Scanner sn = new Scanner(System.in);
        int k=sn.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("The Kth smallest element is "+arr[k-1]);
    }
}