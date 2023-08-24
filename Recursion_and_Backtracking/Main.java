public class Main {
    public static void main(String[] args) {
        // print(1);
        int ans = fibo(4);
        System.out.println(fibo(ans));
    }

    
    // Write a function that take in a number and prints it
    // print first 5 numbers: 1 2 3 4 5
    
    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print(n + 1);
    }


    // 2. Find Nth Fibonacci Number using recursion
    static int fibo(int number){
        // Base Conditon
        if(number<2){
            return number;
        }

        // Recursive Call (Recurrence relation)
        return fibo(number-1) + fibo(number-2);
    }
}