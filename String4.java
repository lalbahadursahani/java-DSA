public class String4 {
 public static String toUpperCase(String str) {
        StringBuilder sb=new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 0; i < str.length()-1; i++) {
            
        
      if (str.charAt(i)== ' ' && i<=str.length()-1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));   
      }
      else{
        sb.append(str.charAt(i));

      }

     } 
return sb.toString();
        
    } 
     
    
    public static String compress(String str) {
        String newStr="";
        for(int i=0; i<str.length()-1 ; i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
          newStr +=str.charAt(i);
          if(count>1){
            newStr +=count.toString();

          }

          
        }
        return newStr;
        
    }

    public static void main(String[] args) {
        String str =" mottu ";
        System.out.println(compress(str));
        System.out.println(toUpperCase(str));
    
}
} 
  

