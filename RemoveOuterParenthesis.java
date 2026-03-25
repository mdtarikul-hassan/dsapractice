public class RemoveOuterParenthesis {
    // --------------------- single brute force approach ------------ O(n)
    static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();  
        int level = 0;  

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++; 
            } 
            else if (ch == ')') {
                level--;  
                if (level > 0) result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "()(()())(())";

        String ans = removeOuterParentheses(s);
        System.out.println("The result is: " + ans);
    }
}
