<<<<<<< HEAD
public class backtracking2 {
    public static void findPermutation(String str, String ans) {
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }
// recursion
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
          String  newstr=str.substring(0, i)+str.substring(i+1);
            findPermutation(newstr,ans+curr);

            
            
        }

        
    }
    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, "");

        
        
    }

    
=======
public class backtracking2 {
    public static void findPermutation(String str, String ans) {
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }
// recursion
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
          String  newstr=str.substring(0, i)+str.substring(i+1);
            findPermutation(newstr,ans+curr);

            
            
        }

        
    }
    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, "");

        
        
    }

    
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
}