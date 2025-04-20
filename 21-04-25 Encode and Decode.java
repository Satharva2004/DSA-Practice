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
