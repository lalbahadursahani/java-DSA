public class Array1 {
    public static void printsubArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start= i;
            for (int j = i; j< numbers.length; j++) {
                int end =j;
                for (int k= start; k < j; k++) {
                    System.out.print(numbers[k]+ " ");

                    
                
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,5,6,3,8,};
        printsubArray(numbers);
    }
    
}
