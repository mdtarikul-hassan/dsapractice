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
    public static void main(String[] args) {
        String st = "margram";
        if(Palindrom(st) == true){
            System.out.println("This is PALINDROM NUMBER");
        }
    }
}
