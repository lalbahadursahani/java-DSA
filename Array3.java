import java.util.Scanner;

public class Array3 {
    public static int linearsearch(int numbers[], int key) {
        for( int i =0; i<numbers.length; i++){
            if (numbers[i]==key) {
                numbers[i]=key;
                return i;  
            }
        
        }
        return -1;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int key =sc.nextInt();
        

        int numbers[]={78,567,34,54,3,34,5,7,8,9,10};
       int index= linearsearch(numbers,key);
        
        if (index==-1) {
            System.out.println("not found");
            
        } else{
            System.out.println("key is at index :" +index);
        }


        
    }
    
}
