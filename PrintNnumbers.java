public class PrintNnumbers {
    public void printNumbers(String name,int count, int N){
    // ---------------------- brute force approach ----------------- O(n)
        if(count == N){
            return;
        }
        System.out.println(name);
        printNumbers(name,count+1, N);
    }
    public static void main(String[] args) {
        String name = "Tarikul";
        int N = 5;
        PrintNnumbers obj = new PrintNnumbers();
        obj.printNumbers(name, 0, N);
    }
}
