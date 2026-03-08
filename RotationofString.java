public class RotationofString {
    static boolean rotation(String s, String goal){
    // --------------- brute force approach ---------------- O(n2)
        // if(s.length() != goal.length()){
        //     return false;
        // }
        // for(int i = 0;i< s.length(); i++){
        //     String rotated = s.substring(i) + s.substring(0,i);
        //     if(rotated.equals(goal)){
        //         return true;
        //     }
        // }
        // return false;


    // --------------- optimal by contains ----------------- O(n)
       if(s.length() != goal.length()){
            return false;
        }
        String doubleS = s+s;
        return doubleS.contains(goal);
    }
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";

        System.out.println(rotation(s, goal));
    }
}
