import java.util.ArrayList;
 public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println("max element = " + max);

        
    }
    
    
    
}
