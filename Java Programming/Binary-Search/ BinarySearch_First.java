class BinarySearch_First {
    public static int firstOcc(int[] arr, int target){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m] == target){
                ans=m; r=m-1;
            } else if(arr[m] < target){
                l=m+1;
            } else r=m-1;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {2,4,4,4,6,8};
        System.out.println(firstOcc(arr,4));
    }
}
