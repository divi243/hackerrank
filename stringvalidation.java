
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
static String isValid(String s) {
    int[] a = new int[26];
    for(int i=0;i<s.length();i++){
        int index = s.toCharArray()[i]-97;
        a[index]++;
       // System.out.print(index);
    }
   Arrays.sort(a);
   int max = a[a.length-1];
   int x = 0;
   for(int i=0;i<a.length;i++){
       System.out.print(a[i]);
       if(a[i]==0){
           x++;
       }
   }
   int min =0;
   
  
   System.out.println(max);
  
    min = a[x];
  
    System.out.println(min);
    
   System.out.println(a[a.length-1]);

if(((max - min == 1) && (max > a[24])) || (min == max ) || ( a[a.length-1] == 1 )){
        return  "YES";
    }else{
        return "NO";
    }
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
