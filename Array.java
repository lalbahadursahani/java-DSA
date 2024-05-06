import java.util.*;
public class Array {
    public static int linearSearch(int numbers[], int key) {

       for (int i =0; i<numbers.length; i++) {
         if (numbers[i]==key) {
            return i;
            
        }
    }
    return -1;


        
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int key=sc.nextInt();
    int numbers[]={1,3,4,5,6,8,7,10};
    
    int index=linearSearch(numbers, key);
    if (index==-1) {
        System.out.println("not found");
        
    }else{
        System.out.println("key is at index:"+index);
    }

}
}
      
    
        
      


