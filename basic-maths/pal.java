//checking if palindrome
class Solutionpal {
    public boolean isPalindrome(int n) {

        int num=0, j=n, a=0;

        if (n == 0) return true;

        while(j!=0){
             a = j%10;
             j = j/10;

             num = (num*10)+a;
        }

        if(num==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n = 12321;
        
        /* Creating an instance of 
        Solution class */
        Solutionpal sol = new Solutionpal();
        
        // Function call to check if n is a palindrome
        boolean ans = sol.isPalindrome(n);
        
        if (ans) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }
}