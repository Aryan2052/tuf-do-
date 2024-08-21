//reversing a given number
class Solutionrev {
    public int reverseNumber(int n) {

        int a=0, j =n, num=0; 
        if (n == 0) return 0;

        while(j!=0){
            a = j%10;
            j = j/10;

            num = (num*10) + a;
        }
        return num;
    }
    public static void main(String[] args) {
        int n = 6678;
        
        /* Creating an instance of 
        Solution class */
        Solutionrev sol = new Solutionrev();
        
        // Function call to reverse the digits in n
        int ans = sol.reverseNumber(n);
        System.out.println("The reverse of given number is: " + ans);
    }
}