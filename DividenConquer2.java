<<<<<<< HEAD
public class DividenConquer2 {
    public static int search(int arr[], int tar, int si ,int ei ) {
        if (si>ei) {
            return -1;
            
        }
        int mid=si+(ei-si)/2;
        // case found
        if (arr[si]==tar) {
            return mid;

            
        }
        // case a: left
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1);

                
            }else{
                //case b: right
              return search(arr, tar, mid+1, ei);
            }
            
        }
        else{
            // case c: right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);
                
            }else{
                // case d: left
                return search(arr, tar, si, mid-1);

            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int terget=6;
        int tarIdx=search(arr, terget, 0, arr.length-1);
        System.out.println(tarIdx);
        
    }
    
}
=======
public class DividenConquer2 {
    public static int search(int arr[], int tar, int si ,int ei ) {
        if (si>ei) {
            return -1;
            
        }
        int mid=si+(ei-si)/2;
        // case found
        if (arr[si]==tar) {
            return mid;

            
        }
        // case a: left
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1);

                
            }else{
                //case b: right
              return search(arr, tar, mid+1, ei);
            }
            
        }
        else{
            // case c: right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);
                
            }else{
                // case d: left
                return search(arr, tar, si, mid-1);

            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int terget=6;
        int tarIdx=search(arr, terget, 0, arr.length-1);
        System.out.println(tarIdx);
        
    }
    
}
>>>>>>> 1240c06ed3992ab6d65ebb79773f2e392465310b
