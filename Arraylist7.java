<<<<<<< HEAD
import java.util.*;


public class Arraylist7 {
public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    ArrayList<Integer>list3=new ArrayList<>();
    for(int i= 1; i<11 ; i++){
        list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
    for(int i=0; i<mainList.size(); i++){
        ArrayList<Integer>cuArrayList=mainList.get(i);
        for (int j= 0; j < cuArrayList.size(); j++) {
            System.out.print(cuArrayList.get(j)+ " ");
            
        }
        System.out.println();
    }
    
}     
    }

    
=======
import java.util.*;


public class Arraylist7 {
public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    ArrayList<Integer>list3=new ArrayList<>();
    for(int i= 1; i<11 ; i++){
        list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
    for(int i=0; i<mainList.size(); i++){
        ArrayList<Integer>cuArrayList=mainList.get(i);
        for (int j= 0; j < cuArrayList.size(); j++) {
            System.out.print(cuArrayList.get(j)+ " ");
            
        }
        System.out.println();
    }
    
}     
    }

    
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
