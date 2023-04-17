package BinarySearch;

//ceiling means find the smallest element which is greater or equal to target elenent
public class  ceiiling {
    public static void main(String[] args) {
        int[] arr={2,5,7,12,15,18};
        int element=6;
        System.out.println(ceiling(arr,element));
    }
    // when element is smaller than target which is smallest element then in banary search we have to
    //return start as element is not found
    static int ceiling(int[] arr, int element){
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
        return start;

    }
}