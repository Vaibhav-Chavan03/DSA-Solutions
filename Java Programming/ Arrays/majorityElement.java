public class majorityElement { 

    static int majorityEle(int arr[]){ 
        int count = 0; //count
        int candidate = 0; //element

        for(int i = 0; i<arr.length;i++){
            if(count == 0 ){
                candidate = arr[i];
            } 
           if(candidate == arr[i]) count++;
           else count--;
        } 
 
        return candidate;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,2,1,1,1};
       System.out.print(majorityEle(arr));
    }
}
