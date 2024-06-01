<<<<<<< HEAD
public class Backtracking {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i==str.length()) {
            System.out.println(ans);
            return;
            
        }
        // yes case
        findSubsets(str ,ans+str.charAt(i), i+1);
        // no case
        findSubsets(str, ans , i+1);
    
    }

    
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str," ", 0);
        
    }
    
}
=======
public class Backtracking {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i==str.length()) {
            System.out.println(ans);
            return;
            
        }
        // yes case
        findSubsets(str ,ans+str.charAt(i), i+1);
        // no case
        findSubsets(str, ans , i+1);
    
    }

    
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str," ", 0);
        
    }
    
}
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
