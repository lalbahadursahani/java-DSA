<<<<<<< HEAD
import javax.sql.rowset.spi.SyncResolver;

public class backtracking1 {
    public static void findsubSets(String str , String ans, int i ) {
        if (i==str.length()) {
            if (str.length()==0) {
                System.out.println("null");
                
            } else{
            System.out.println(ans);
            }
            return;

            
        }
        findsubSets(str, ans+str.charAt(i), i+1);
        findsubSets(str, ans, i+1);
        
    }
    public static void main(String[] args) {
        String str="abcd";
        findsubSets(str, " ", 0);
        

        
    }
    
    
}
=======
import javax.sql.rowset.spi.SyncResolver;

public class backtracking1 {
    public static void findsubSets(String str , String ans, int i ) {
        if (i==str.length()) {
            if (str.length()==0) {
                System.out.println("null");
                
            } else{
            System.out.println(ans);
            }
            return;

            
        }
        findsubSets(str, ans+str.charAt(i), i+1);
        findsubSets(str, ans, i+1);
        
    }
    public static void main(String[] args) {
        String str="abcd";
        findsubSets(str, " ", 0);
        

        
    }
    
    
}
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
