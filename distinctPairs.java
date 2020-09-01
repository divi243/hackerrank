import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
    int count=0,C=0;
      Arrays.sort(arr);
      HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();

      for(int i=0;i<arr.length;i++){
          hm.put(arr[i],1);
        }
       for(Map.Entry<Integer,Integer> set:hm.entrySet()){
           if(hm.containsKey(set.getKey()+k)){
               count++;
               
           }
       }
      
    //   for(int i=arr.length-1;i>=0;i--){
    //       for(int j=i-1;j>=0;j--)
    //       if(arr[i]-arr[j]==k){

    //           count++;
    //           break;
    //       }
    //       C++;
    //   }
    //   System.out.println(C);
    //   System.out.println(count);
     return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
