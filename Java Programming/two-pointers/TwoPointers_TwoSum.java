class TwoPointers_TwoSum {
    public static int[] twoSum(int[] arr, int t){
        int l=0,r=arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==t) return new int[]{l,r};
            if(sum<t) l++; else r--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6};
        int[] res = twoSum(arr,7);
        System.out.println(res[0] + " " + res[1]);
    }
}
