//armstrong

class Solutionarm {
    public boolean isArmstrong(int n) {

        int j=n, a=0, sum=0;

        if (n < 10 && n>=0) return true;

        while(j!=0){
            a = j%10;
            j = j/10;

            //isue of incopatible data types
            sum = sum + (int)Math.pow(a,3);
        }

        return sum == n;

    }
    public static void main(String[] args) {
        int n = 153;
        
        /* Creating an instance of 
        Solution class */
        Solutionarm sol = new Solutionarm();
        
        /* Function call to find whether the
        given number is Armstrong or not */
        boolean ans = sol.isArmstrong(n);
        
        if (ans) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}