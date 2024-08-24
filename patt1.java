class Solution {
    public void pattern1(int n) {
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int N = 4;

        // Create an instance of the Solution class
        Solution sol = new Solution();

        sol.pattern1(N);
    }
}
