public class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean isEmpty(Node head){
        return head==null;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
    }


    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
    }
    public void printList(){
        Node curr=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data + "-->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    public void deleteFirst(Node head){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        head=head.next;
    }

    public void deleteLast(Node head){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public int size(){
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public
     Node removeNthFromEnd(Node head ,int n){
        Node dummy=new Node(0);
        dummy.next = head;
        Node slow=dummy;Node fast=dummy;

        for(int i=0;i<=n;i++){
            fast=fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next=slow.next.next;


        return dummy.next;

    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(0);
        list.printList();
        System.out.print(list.size());

        // Node head=new Node(10);
        // head.next=new Node(20);



    }
    
}
