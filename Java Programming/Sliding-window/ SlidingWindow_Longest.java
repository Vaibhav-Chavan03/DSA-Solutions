class SlidingWindow_Longest {
    public static int lengthOfLongestSubstring(String s){
        int[] map = new int[256];
        int l = 0, max = 0;
        for(int r = 0; r < s.length(); r++){
            map[s.charAt(r)]++;
            while(map[s.charAt(r)] > 1){
                map[s.charAt(l)]--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
