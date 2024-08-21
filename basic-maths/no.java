import java.util.*;
class no{
    public int countDigit(int n) {
        
        int count=0, j= n;

        if (n == 0) return 1;

        while(j != 0){
            j = j/10;
            count++;
        }
        return count;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        /* Creating an instance of
        Solution class */
        no sol = new no();

        // Function call to get count of digits in n
        int ans = sol.countDigit(n);
        System.out.println("The count of digits in the given number is: " + ans);

    }
    
}