package BinarySearch;

public class mountainArrayBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        // find the pick of the arrr ans=4
        System.out.println(indexPickArray(arr));

    }
    static int indexPickArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=(start+end)/2;

            if(arr[mid]>arr[mid+1]){
                // desending of array is start
                //but it is possible that there might be array in left side so search
                end=mid;
            }
            else{
                start=mid+1;

            }
        }
        //the pick value is start or end
        return arr[start];

    }
}
