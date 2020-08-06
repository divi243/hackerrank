import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
 
static class Point {
    public char key;
    public long count;

    public Point(char x, long y) {
        key = x;
        count = y;
    }
}

// Complete the substrCount function below.
static long substrCount(int n, String s) {
    int count =0;
    for(int i=0;i<s.length();i++){ //aabaa
    count++;
        for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)!= s.charAt(j))
            {
                if(2*j-i<s.length() && s.substring(i,j).equals(s.substring(j+1,2*j-i+1))){
                   count++;
                   break;
                }
                else{
                   break;
                } 
            }
            else
            {
                count++;
            }
            }
        }
    
    return count;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();
         
        long result = substrCount(n,s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
