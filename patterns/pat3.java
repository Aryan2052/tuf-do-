class Solution {
    public void pattern3(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern3(N);
    }
}