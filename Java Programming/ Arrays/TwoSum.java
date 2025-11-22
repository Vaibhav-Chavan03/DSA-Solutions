
import java.util.HashMap;

public class TwoSum {   
    
    public static int[] bruteForce(int arr[],int k){
        int n = arr.length; 
        int ans [] = new int[2];
        ans[0] = -1; ans[1] = -1;

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
               if(arr[i] + arr[j] == k){
                 ans[0] = i;
                 ans[1] = j; 
                 return ans;
               }
            }
        } 
        return ans;
    }

  static int[] bruteforce(int arr[],int k){ 
   int i = 0; int ans [] = new int[2]; ans[0] = -1; ans[1] = -1;
     ans =  brut(arr,ans, i, k);   
    return ans;
  }

  static int[] brut(int[] arr, int[] ans, int i, int k){ 
    //  int ans [] = new int[2];  

     if(i >= arr.length ) return ans; 

      for(int j = i;j<arr.length;j++){
         if(arr[i] + arr[j] == k){
            ans[0] = i;
            ans[1] = j; 
            return ans;
         }
    }  
    
    brut(arr, ans, i, k);
     return ans;
  } 


  static int[] better(int arr[],int k ){ 
    HashMap <Integer,Integer> mp = new HashMap<>();

    for(int i = 0;i<arr.length;i++){
      int comp = k - arr[i];
      
      // checking for his partner ele.
      if(mp.containsKey(comp)){ 
        return new int[] {mp.get(comp),i};
      }

      mp.put(arr[i],i);
    } 
    return new int[] {-1,-1};
  }

    public static void main(String[] args) {
        int arr[] = {2,6,7,8,11}; int k = 14; 

        int ans[] = better(arr, k); 
        System.out.println(ans[0] + " , "  + ans[1]);
    }
}
