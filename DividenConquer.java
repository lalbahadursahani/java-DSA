<<<<<<< HEAD
public class DividenConquer {
    public static void printArr(int arr[]) {
        for ( int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
        
    }
    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei){
            return;

            
        }
        int mid =si+(ei-si)/2;
        mergeSort(arr, si, mid); //left part 

        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);


        
    }
    public static void merge(int arr[],int si,int mid, int ei) {
        int temp[]=new int [ei-si+1];
        int i =si; // iterator for left
        int j=mid+1; // iterator for right

        int k=0; // iterator fortemp arr
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;


            }
            k++;
            
        } // lept part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        } //right part
        while (j<=ei) {
            temp[k++]=arr[j++];
            
        }
        for (k=0, i=si; k <temp.length; k++, i++) {
            arr[i]=temp[k];
            
        }

        
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,9,8,11,-2,-3};
      mergeSort(arr,0, arr.length-1);
      printArr(arr);
    }
}

=======
public class DividenConquer {
    public static void printArr(int arr[]) {
        for ( int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
        
    }
    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei){
            return;

            
        }
        int mid =si+(ei-si)/2;
        mergeSort(arr, si, mid); //left part 

        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);


        
    }
    public static void merge(int arr[],int si,int mid, int ei) {
        int temp[]=new int [ei-si+1];
        int i =si; // iterator for left
        int j=mid+1; // iterator for right

        int k=0; // iterator fortemp arr
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;


            }
            k++;
            
        } // lept part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        } //right part
        while (j<=ei) {
            temp[k++]=arr[j++];
            
        }
        for (k=0, i=si; k <temp.length; k++, i++) {
            arr[i]=temp[k];
            
        }

        
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,9,8,11,-2,-3};
      mergeSort(arr,0, arr.length-1);
      printArr(arr);
    }
}

>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
    