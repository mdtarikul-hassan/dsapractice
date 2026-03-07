public class ReverseString {
    static String stringReverse(String s) {
    	StringBuilder res = new StringBuilder(s);
        res.reverse();
      	return res.toString();
    }
  	
    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(stringReverse(s));
    }
}
