public class LinkedList2 {
    public class Node{

        int data;
       Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
        

        
    }
    public static Node head;
    public static Node tail;
  public static int size;

    public void addFirst(int data){
        // step1 create new node
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
            
        }

        // step 2  newNode next=head
         newNode.next=head;
         // step3 head=newNode
         head=newNode;
    
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;

            
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if (head==null) {
            System.out.println("LL is empty");
            return;
            
        }


        Node temp=head;
        while (temp!=null) {

            System.out.print(temp.data+ "->");
            temp =temp.next;

            
        }
        System.out.println();
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;


        }
        if (head.data==key) {
            return 0;

            
        }
        int idx=helper(head.next, key);
        if (idx==-1) {
            return -1;
            
        }
        return idx+1;


    }

    public int recsearch(int key){
        return helper(head, key);
    }

    /*    reverse a Linked List*/
    public void Reverse(){
        Node prev= null;
        Node curr=tail=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;


            
        }
        head=prev;
    }

    /*   find & remove nth node from end */
    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp =head;
        while (temp!=null) {
            temp =temp.next;
            sz++;

            
        }
        if (n==sz) {
            head=head.next;
            return;
            
        }
        // sz-n
        int i=1;
        int idxtofind=sz-n;
        Node prev=head;
        while (i<idxtofind){
            prev=prev.next;
            i++;

            
        }
        prev.next=prev.next.next;
        return;

    }
    /*  check if ll is a palindrome */
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next; //+1
            fast=fast.next.next; // +2


            
        }
       return slow;// slow is my midNode
    }
    public boolean checkpalindrome(){
        if (head== null || head.next==null) {
            return true;

            
        }
        // step1: find mid
        Node miNode=findMid(head);
        // step2: reverse 2nd half
        Node prev=null;
        Node curr=miNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;



            
        }
       Node right =prev; //right half head
       Node left=head;
       //step3: check left half & right half
       while (right!=null) {
        if (left.data!=right.data) {
            return false;
            
        }
        left= left.next;
        right=right.next;
        
       }
       return true;

    }
    public static void main(String[] args) {
  LinkedList2 ll=new LinkedList2();
  ll.addFirst(2);
  ll.addFirst(1);
  ll.addLast(2);
 ll.addLast(1);
 ll.print();

System.out.println(ll.checkpalindrome());

        
    }
}