import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
        // // -------------- optimal approach -------------- O(n*k)
    // static final int MAX_CHAR = 26;

    // static String getHash(String s) {
    //     StringBuilder hash = new StringBuilder();
    //     int[] freq = new int[MAX_CHAR];
        
    //     for (char ch : s.toCharArray()) {
    //         freq[ch - 'a']++;
    //     }

    //     for (int i = 0; i < MAX_CHAR; i++) {
    //         hash.append(freq[i]);
    //         hash.append("$");
    //     }

    //     return hash.toString();
    // }
    // static ArrayList<ArrayList<String>> anagrams(String[] arr) {
    //     ArrayList<ArrayList<String>> res = new ArrayList<>();
    //     Map<String, Integer> mp = new HashMap<>();
        
    //     for (int i = 0; i < arr.length; i++) {
    //         String key = getHash(arr[i]);
            
    //         if (!mp.containsKey(key)) {
    //             mp.put(key, res.size());
    //             res.add(new ArrayList<>());
    //         }

    //         res.get(mp.get(key)).add(arr[i]);
    //     }

    //     return res;
    // }
    // public static void main(String[] args) {
    //     String[] arr = {"act", "god", "cat", "dog", "tac"};
        
    //     ArrayList<ArrayList<String>> res = anagrams(arr);
        
    //     for (List<String> group : res) {
    //         for (String word : group) {
    //             System.out.print(word + " ");
    //         }
    //         System.out.println();
    //     }
    // }


// ------------- brute force approach ----------------

    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            s = new String(chars);
            if (!mp.containsKey(s)) {
                mp.put(s, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(s)).add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        
        ArrayList<ArrayList<String>> res = anagrams(arr);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++)
                System.out.print(res.get(i).get(j) + " ");
            System.out.println();
        }
    }
}
