import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Array{

    public static void maxsubArray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;


        for (int i= 0; i < numbers.length; i++) {
            int start=i;
        
            for (int j=i; j <numbers.length; j++) {
                int end=j;
                currSum=0;
                for (int k=start; k<end; k++) {
                    currSum+=numbers[k];

                }
                System.err.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                
                }

              
                    
                }
                
                
System.out.println();
                
            }
            System.out.println("max Sum=" +maxSum);
        }    
    
       public static void main(String[] args){
    int numbers[]={1,2,3,4,5,6,7,8};
maxsubArray(numbers);
    
    

}
}