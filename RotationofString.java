public class RotationofString {
    static boolean rotation(String s, String goal){
    // --------------- brute force approach ---------------- O(n)
        if(s.length() != goal.length()){
            return false;
        }
        for(int i = 0;i< s.length(); i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";

        System.out.println(rotation(s, goal));
    }
}
