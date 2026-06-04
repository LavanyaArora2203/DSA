public class QueueLL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static node head=null;
        static node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            node newNode =new node(data);
            if(isEmpty()){
                tail=head=newNode;
                return;
            }
            
            tail.next=newNode;
            tail=newNode;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return result;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;

        }



    }
    
}
