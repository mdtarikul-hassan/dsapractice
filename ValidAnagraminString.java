
import java.util.Arrays;

public class ValidAnagraminString {
    static boolean checkAnagram(String str1, String str2){
    // ----------------- brute force approach -------------- O(nlogn)
        if(str1.length() != str2.length()){
            return false;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for(int i = 0; i< str1.length(); i++){
            if(char1[i] != char2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         String Str1 = "INTEGER";
        String Str2 = "TEGERNI";

        if (checkAnagram(Str1, Str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
