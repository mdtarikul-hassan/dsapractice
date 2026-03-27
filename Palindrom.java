public class Palindrom {
    // ------------- palindrom using recursion ------------ 
    public boolean isPlaindrom(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return isPlaindrom(str, left +1, right -1);
    }
    public static void main(String[] args) {
        String vill = "margram";
        Palindrom obj = new Palindrom();
        if(obj.isPlaindrom(vill, 0, vill.length()-1)){
            System.out.println(vill +" is palindrom");
        }else{
            System.out.println(vill + " is not palindrom");
        }
    }
}
