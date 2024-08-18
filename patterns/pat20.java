class Solution20 {
    public void pattern20(int n) {
        
        //rows for upper pattern
        for(int i=1; i<=n; i++){

            //lhs pattern
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //blank
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //rhs pattern
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        //rows for lower pattern
        for(int i=n-1; i>=1; i--){

            //lhs
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //blank
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //rhs
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {
        int N = 5;
        
        // Create an instance of Solution class
        Solution20 sol = new Solution20();
        
        sol.pattern20(N);
    }
}