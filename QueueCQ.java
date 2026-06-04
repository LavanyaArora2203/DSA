public class QueueCQ {
    public class circulaQueue{
        static int arr[];
        static int size;
        static int rear=-1;static int front=-1;
        circulaQueue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return front==-1 && rear==-1;

        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if (isFull()){
                System.out.println("Empty queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            front=(front+1)%size;
            return result;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    
    
}
