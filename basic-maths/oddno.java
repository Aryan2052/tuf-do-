class Solutionodd {
    public int countOddDigit(int n) {

        if (n == 0) return 0;
        int a=0, j=n, count =0;

        while(j!=0){
            a = j%10;
            j = j/10;

            if(a%2!=0){
                count++;
            }

        }
        return count;

    }
    public static void main(String[] args) {
        int n = 6678;
        
        /* Creating an instance of 
        Solution class */
        Solutionodd sol = new Solutionodd(); 
        
        // Function call to get count of odd digits in n
        int ans = sol.countOddDigit(n);
        System.out.println("The count of odd digits in the given number is: " + ans);
    }
}