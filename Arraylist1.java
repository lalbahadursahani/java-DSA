import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Boolean>list2=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.set(2,9);
        System.out.println(list);
        System.out.println(list.size());
        // prinnt the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        


        
    }
    
}
