<<<<<<< HEAD
import java.util.*;
public class Arraylist6 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(5);
        mainList.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(5); list2.add(4);
        mainList.add(list2);
        for (int i = 0; i <list.size(); i++) {
            ArrayList<Integer>currlist=mainList.get(i);
            for (int j= 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j)+ " ");

                
            }
            System.out.println();
            
        }
        System.out.println(mainList);


        
    }
    
}
=======
import java.util.*;
public class Arraylist6 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(5);
        mainList.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(5); list2.add(4);
        mainList.add(list2);
        for (int i = 0; i <list.size(); i++) {
            ArrayList<Integer>currlist=mainList.get(i);
            for (int j= 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j)+ " ");

                
            }
            System.out.println();
            
        }
        System.out.println(mainList);


        
    }
    
}
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
