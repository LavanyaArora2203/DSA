public class BinarySearch {
    public static int binarySearchIterative(int[] arr,int target){ //Time: O(log n), Space: O(1)
        int start=0;int end=arr.length-1;
        int mid=start + (end-start)/2;//safe for overflows
        while(start<end){
            if(arr[mid]>target){
                end=mid-1;

            }else if(arr[mid]<target){
                start=mid+1;

            }else{
                return mid;
                
            }

        }
        return -1;

    }
    public static int binarySearchRecursive(int []arr,int target,int st,int end){ //Time: O(log n), Space: O(logn)
        if(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                return binarySearchRecursive(arr, target, st, mid-1);

            }else if(arr[mid]<target){
                return binarySearchRecursive(arr, target, mid+1, end);

            }else{
                return mid;
                
            }
            
        }else{
            return -1;
        }



        // public static int peakIndexInMountainArray(int[] arr){
        //     int i=0;
        //     while(arr[i]<arr[i+1]){
        //         i++;
        //     }

        //     return arr[i+1];
        // }
        
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        
        System.out.println(binarySearchIterative(arr, 7));   // Output: 3
        System.out.println(binarySearchIterative(arr, 6));   // Output: -1
        System.out.println(binarySearchIterative(arr, 1));   // Output: 0
        System.out.println(binarySearchRecursive(arr, 17,0,8));  // Output: 8
    }
}
