import java.util.*;
//two pointers
public class day1 {
    public static void reverse(int[] arr){
        int l=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void generatePairs(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static int targetSumPairs(int[] arr,int t){ //O(n)
        int i=0;int j=arr.length-1;int count =0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==t){
                count++;
                i++;j--;
            }else if(sum<t){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // //bubble sort-->O(n^2)
        // //selectionSort-->O(n^2)
        // insertionSort(arr);
        System.out.println(reverse(arr););

    }
//hw-3 sum

    public static int trapped(int[] arr){
        int i=0;int j=arr.length-1;
        int max=0

    }

    
}
