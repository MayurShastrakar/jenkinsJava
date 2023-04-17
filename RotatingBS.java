package BinarySearch;

public class RotatingBS {
    public static void main(String[] args) {
        // pivot : when search is Binaery search is routeted then
        //largest element in the search is pivot
        int arr[]={ 4 ,5,7,9,12,1,2,3};
        System.out.println("largest no in arrry is:"+arr[pivot(arr)]);
        //for rotation piviy+1;
        int rotate=pivot(arr)+1;
        System.out.println("rotation in array is "+rotate);
    }
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(mid<end &&arr[mid]>arr[mid+1]){
                    return  mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 0;
    }
}
