
import java.util.HashMap;

public class IsomorphicString {
    public boolean areIsomorphic(String s1, String s2){
    // ------------------------- by hashmap --------------- O(n)
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if(!m1.containsKey(s1.charAt(i))){
                m1.put(s1.charAt(i), i);
            }
            if(!m2.containsKey(s2.charAt(i))){
                m2.put(s2.charAt(i), i);
            }
            if(m1.containsKey(s1.charAt(i)) != m2.containsKey(s2.charAt(i))){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        IsomorphicString obj = new IsomorphicString();
        if (obj.areIsomorphic(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
