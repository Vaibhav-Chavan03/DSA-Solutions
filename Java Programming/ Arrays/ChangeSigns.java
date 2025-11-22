public class ChangeSigns { 
    static void bruteforce(int arr[]){ 
        int k = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > 0){
               if(i != k && arr[k] < 0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k+=2;
               } else if(i == k){
                k +=2;
               }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,1,2,3};
        bruteforce(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
