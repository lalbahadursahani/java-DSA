public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        p1.setTips(5);
        p1.color="yellow";
        System.out.println(p1.color);
        System.out.println(p1.tips);
        BankAccount myAcc=new BankAccount();
        myAcc.username="lal bahadur sahani";
        myAcc.setpassword(
    "ajdhhc");
    System.out.println(myAcc.username);
    



    
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){

    
    password=pwd;
    }
}
    class Pen{
        String color;
        int tips;

    
    void setColor(String newColor){
         color= newColor;

    }
    void setTips(int newTips ){
        tips=newTips;
       
    
    }
         
}     
           
    

