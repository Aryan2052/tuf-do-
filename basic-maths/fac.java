//factorial
class Solutionfac {
    public int factorial(int n) {

        int fac =1, j=n;
        if (n == 0) return 1;

        while(j!=0){
            fac = fac*j;
            j--;
        }
        return fac;

    }
    public static void main(String[] args) {
        int n = 4;
        
        /* Creating an instance of 
        Solution class */
        Solutionfac sol = new Solutionfac();
        
        // Function call to find the factorial of n
        int ans = sol.factorial(n);
        
        System.out.println("The factorial of given number is: " + ans);
    }
}