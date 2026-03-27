public class Fibonacci {
    // ---------- fibonacci using recursion -------------
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int n = 5;
        System.out.println("Fibonacci of "+ n + " terms : ");
        for(int i = 0; i<n; i++){
            System.out.print(obj.fibonacci(i));
            if(i < n-1){
                System.out.print(",");
            }
        }
        
    }
}
