public class String3 {
    public static float getshotestpath(String str) {
        int x=0; int y=0;
        for (int i= 0; i < str.length(); i++) {
            char dir=str.charAt(i);
            if (dir== 's') {
                y--;
                
            }else if (dir=='w') {
                x--;
                
            }else if (dir =='n') {
                y++;

                
            }else{
               x++; 
            }
            
        }
            int x2=x*x;
            int y2=y*y;
            return (float)Math.sqrt(x2 + y2);

        
    
    
}
public static void main(String[] args){
    String str="wwe";
    System.out.println(getshotestpath(str));
}
}
   /*  public static void main(String[] args) {
        
    

String s1="lal";
String s2="bahadur";


if(s1.equals(s2)){
    System.out.println(" strings are equal");


}else{
    System.out.println("string are not equal");
}
}
}

*/
