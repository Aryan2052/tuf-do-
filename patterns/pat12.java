class Solution12 {
    public void pattern12(int n) {
        int k = 2*(n-1);

        //rows
        for(int i=1; i<=n; i++){

            //lhs pattern
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //blank spaces
            for(int j=1; j<=k; j++){
                System.out.print(" ");
            }
            k = k-2;

            //rhs
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //next line
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution12 sol = new Solution12();

        sol.pattern12(N);
    }
}
