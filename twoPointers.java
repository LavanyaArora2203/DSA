public class twoPointers {
    // public static int[] twoSum(int [] arr){
        
    // }

    public static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //bubble sort-->O(n^2)
        //selectionSort-->O(n^2)
        insertionSort(arr);
        System.out.println(arr);

    }
    
}
