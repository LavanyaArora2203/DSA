public class sorting {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        
    }
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
                int temp=arr[i];
                arr[i]=min;
                min=temp;


            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1] = curr;
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
