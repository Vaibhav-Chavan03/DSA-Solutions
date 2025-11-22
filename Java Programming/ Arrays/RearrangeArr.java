class RearrangeArr { 
    public static int[] rearrangeArray(int[] nums) { 
        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int x : nums) {
            if (x > 0) {
                ans[pos] = x;
                pos += 2;
            } else {
                ans[neg] = x;
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int[] res = rearrangeArray(nums);

        // print output
        for(int val : res){
            System.out.print(val+" ");
        }
    }
}
