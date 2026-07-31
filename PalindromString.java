public class PalindromString {
    static boolean Palindrom(String st){
        int n = st.length();
        for(int i = 0; i<n/2;i++){
            if(st.charAt(i) != st.charAt(n-1-i)){
                System.out.println("This is not a palindrom number.");
                return false;
            }
        }
        return true;
    }
    
// ------------ valid palindrom without letter, word, space ----------- O(n)    
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String st = "margram";
        if(Palindrom(st) == true){
            System.out.println("This is PALINDROM NUMBER");
        }
    
        if(isPalindrome(st)){
            System.out.println("this is a palindrom number");
        }else{
            System.out.println("this is not a palindrom number");
        }
    }
}
