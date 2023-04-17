package BinarySearch;

// order argostic means eithet array is in asending order or decsending order
public class orderAgosticvBs {

    public static void main(String[] args) {
        int[] arr={7,6,5,3,2};
        int target=6;
        System.out.println(orderAgosticvBs(arr,target));
    }
    static int orderAgosticvBs(int arr[],int element) {
        int start = 0;
        int end = arr.length - 1;
        boolean b;
            if (arr[0] < arr[arr.length - 1]) {
                b=true;
            }
            else{
                b=false;
            }

        while (start<=end){
            int mid=(start+end)/2;
            if (element==arr[mid])
                return mid;
           if (b){
               if (element>arr[mid])
                       start=mid+1;
                   else if (element<arr[mid])
                       end=mid-1;
               }
           else {
                    if (element<arr[mid])
                       start=mid+1;
                   else if (element>arr[mid])
                       end=mid-1;
               }
           }
           return 0;
           }
}
