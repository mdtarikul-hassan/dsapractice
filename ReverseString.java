public class ReverseString {
    static String stringReverse(String s) {
    	StringBuilder res = new StringBuilder(s);
        res.reverse();
      	return res.toString();
    }
  	
// ------------ reverse string from char[] ------------ O(n)
    public static void reverseString(char[] s) {
        int l=0, r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(stringReverse(s));
    
        char[] s1 = {'t','a','r','i','k','u','l'};
        reverseString(s1);
    }
}
