//encode decode final solution
class Solution {

    public String encode(List<String> strs) {
        String result = ""; //empty string to store encodeded string eg- iloveneedcode
        for (String s : strs) { //using for-each loop for parsing trough elements of list
            result = result + s.length() + "#" + s; // adding to the result like the result string is empty so result = "" + s.lenght + "#" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>(); //return output basically the result
        int i = 0; //i for the loop
        while(i<str.length()){ //itereting till the length of the string
            int j = i; //setting both the string at the same position 
            while(str.charAt(j) != '#'){ //finding the # using j if not presnt the value of j incresese  
                j++; //increment until not found
            }
            int len = Integer.parseInt(str.substring(i,j)); //once an # is found we need to find the length of the string which we encoded so substring it like 1=0 & j=1; so substring(i,j) to find the number
            j++; //moving the j towards the letter
            output.add(str.substring(j,j+len)); //adding the word to the outtup but we need to add j value each time which will be 2 more than that like length is 5 but the firsttwo characters are num and # then we need to add that
            i = j+len; //j+len as to bring both the pointer at the same position
        }
        return output;
    }
}




import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<String> st = new ArrayList<>();
        st.add("apple");
        st.add("banana");
        System.out.println(encode(st));
    }

    public static String encode(List<String> strs) {
        String result = "";
        for (String s : strs) {
            result += s.length() + "#" + s;
        }
        return result;
    }
    public static List<String> decode(String result){
        List<String> output = new ArrayList<>();
        for(int i=0;i<result.length();i++){
            int index = 0;
            
        }
    }
}
