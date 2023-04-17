package BinarySearch;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int element=6;
        System.out.println(search(arr,element));
    }
    static int search(int[] arr,int element){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= (start + end)/2;  // mid = start + (end-start)/2
            if(element<arr[mid]){
                end=mid-1;
            }
            else if (element>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;

    }
}
