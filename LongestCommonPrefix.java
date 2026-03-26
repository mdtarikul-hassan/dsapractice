
import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] s){
// --------------------- brute force approach --------------------- O(nlogn)
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);

        String first = s[0];

        String last = s[s.length -1];

        for(int i = 0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] input = {"interview", "internet", "internal", "interval"};

        LongestCommonPrefix obj = new LongestCommonPrefix();
        String result = obj.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix : "+ result);
    }
}
