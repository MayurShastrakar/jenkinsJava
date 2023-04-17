package BinarySearch;

// floor means: find the gretest  element which is smaller or equal to target elenent
public class floor {
    public static void main(String[] args) {
        int[] arr={2,5,7,12,15,18};
        int element=13;
        System.out.println(floor(arr,element));
    }
    // when element is greater than target which is smallest element then in banary search we have to
    //return start as element is not found it will return index
    static int floor(int[] arr, int element){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= (start + end)/2;
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
        return end;

    }
}
