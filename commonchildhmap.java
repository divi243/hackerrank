import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
      
    HashMap<Character,Integer> str1 = new LinkedHashMap <Character,Integer>();
 HashMap<Character,Integer> str2 = new LinkedHashMap <Character,Integer>();

     for(int i=0;i<s1.length();i++){
         if(str1.containsKey(s1.toCharArray()[i])){
             str1.replace(s1.toCharArray()[i],str1.get(s1.toCharArray()[i])+1);
         }
         else{
             str1.put(s1.toCharArray()[i],1);
         }
     }
    for(int i=0;i<s2.length();i++){
         if(str2.containsKey(s2.toCharArray()[i])){
             str2.replace(s2.toCharArray()[i],str2.get(s2.toCharArray()[i])+1);
         }
         else{
             str2.put(s2.toCharArray()[i],1);
         }
     }
  //  Map<String, Object> map = new HashMap<String, Object>();
Character[] keys = new Character[str1.size()];
Character[] keys2 = new Character[str2.size()];
Integer[] values = new Integer[str1.size()];
Integer[] values2 = new Integer[str2.size()];
int index = 0;
System.out.println(values.length);
System.out.println(str1.size());

for (Map.Entry<Character, Integer> mapEntry : str1.entrySet()) {
    keys[index] = mapEntry.getKey();
    values[index] = mapEntry.getValue();
    index++;
}
index=0;
for (Map.Entry<Character, Integer> mapEntry : str2.entrySet()) {
    keys2[index] = mapEntry.getKey();
    values2[index] = mapEntry.getValue();
    index++;

}
for(int i=0;i<keys.length;i++){
    for(int j=0;j<keys2.length;j++){
        
        if((keys[i]==keys2[j]) && (values2[j]<=values[i])){
            values2[j]--;

        }else if((keys[i]==keys2[j]) && (values2[j]>=values[i])){
           values[i]--;
        }
      
    }
}
int count=0;
for(int i=0;i<keys.length;i++){
    for(int j=0;j<keys2.length;j++){
        if(keys[i]==keys2[j]){
            if(values2[j]==0 || values[i]==0){
          count++; 
            }
        }
    }}

    for(int  i=0;i<keys.length;i++){
        System.out.println(keys[i]+" - "+values[i]);
    }
     for(int  i=0;i<keys2.length;i++){
        System.out.println(keys2[i]+"-"+values2[i]);
    }

    //  for (Map.Entry mapElement : str1.entrySet()) { 
    //          Character key = (Character)mapElement.getKey(); 
  
    //         // Add some bonus marks 
    //         // to all the students and print it 
    //         int value = ((int)mapElement.getValue()); 
  
    //         System.out.println(key + " : " + value); 
    //     } 
    //     for (Map.Entry mapElement : str2.entrySet()) { 
    //          Character key = (Character)mapElement.getKey(); 
  
    //         // Add some bonus marks 
    //         // to all the students and print it 
    //         int value = ((int)mapElement.getValue()); 
  
    //         System.out.println(key + " : " + value); 
    //     } 

     System.out.println(count);
      return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
