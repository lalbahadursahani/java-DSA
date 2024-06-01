<<<<<<< HEAD
public class DividenConquer1 {
    public static void printArr(int arr[]) {
        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
System.out.println();
        
    }
    public static void quickSort(int arr[], int si, int ei ){
        if (si>=ei) {
            return;
            
        }
        // last element
        int pidx=partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);


    }
    public static int partition(int arr[], int si,int ei){
        int pivot=arr[ei];
        int i= si-1;
        for (int j =si; j<ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
            
        } 
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }

    
    public static void main(String[] args) {
       int  arr[]={3,5,2,7,8,9,1,12};
    
       quickSort(arr, 0,arr.length-1);
       printArr(arr);

        
    }


    
} 

=======
public class DividenConquer1 {
    public static void printArr(int arr[]) {
        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
System.out.println();
        
    }
    public static void quickSort(int arr[], int si, int ei ){
        if (si>=ei) {
            return;
            
        }
        // last element
        int pidx=partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);


    }
    public static int partition(int arr[], int si,int ei){
        int pivot=arr[ei];
        int i= si-1;
        for (int j =si; j<ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
            
        } 
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }

    
    public static void main(String[] args) {
       int  arr[]={3,5,2,7,8,9,1,12};
    
       quickSort(arr, 0,arr.length-1);
       printArr(arr);

        
    }


    
} 

>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
