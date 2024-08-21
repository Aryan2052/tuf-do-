//mmax digit of a number
class Solutionmax {
    public int largestDigit(int n) {

        int max=0, a=0, j=n;
        if (n == 0) return 0;

        while(j!=0){
            a = j%10;
            j = j/10;

            max = Math.max(a,max);
        }
        return max;

    }
    public static void main(String[] args) {
        int n = 348;

        /* Creating an instance of 
        Solution class */
        Solutionmax sol = new Solutionmax();

        // Function call to find the largest digit in n
        int ans = sol.largestDigit(n);

        System.out.println("The largest digit in the number is: " + ans);
    }
}