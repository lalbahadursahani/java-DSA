
public class LinkedList1 {
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
    public int removeFirst(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val =head.data;
            head =tail=null;
            return val;
        }
        int val=head.data;
        head =head.next;
        return val;


    }
    /* search key */
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i; 
            }
            temp=temp.next;
            i++;
            
        }
        // not found
        return -1;


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



    
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
   
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(3); 
       ll.print(); ll.addLast(4);
       ll.addLast(5);
   
      
     
      ll.print();
      System.out.println( "size is :" +ll.size);
      System.out.println(ll.itrSearch(5));
      System.out.println(ll.itrSearch(8));
System.out.println(ll.recsearch(2));
    

    }
   
}
  
        
    
    

