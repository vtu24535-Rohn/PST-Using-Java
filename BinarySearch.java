import java.util.*;
public class BinarySearch {
    public static int BinarySearch(int arr[], int target){
        int low = 0;
        int high= arr.length - 1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,14,15,558};
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int result = BinarySearch(arr, n);
        if (result == -1){
            System.out.println("The target "+n+" is not avalable in the array");
        }
        else{
            System.out.println("The Target element found at index "+result);
        }
    }
}
