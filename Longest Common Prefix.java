//using substring also can use concat
class Solution {
  public String longestCommonPrefix(String[] strs){
    Arrays.sort(strs);
    String result = "";
    String str1 = strs[0];
    String str2 = strs[strs.length-1];
    index = 0;
    while(index<str1.length()){
      if(str1.charAt(i) != str2.charAt(i)){
        break;
      }
      index++;
      result += str.charAt(i);
    }
    return str1.subsequence(0,index);
    //can also return result;
  }
}

//with stringbuilder
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder strbld = new StringBuilder();
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
            strbld.append(str1.charAt(i));
        }
        return strbld.toString();

    }
}
