class Solution19 {
    public void pattern19(int n) {

        // First half of the pattern
        for (int i = 0; i < n; i++) {

            // Left-hand side pattern
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int k = 0; k < i; k++) {
                System.out.print("  "); // Two spaces
            }

            // Right-hand side pattern
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second half of the pattern
        for (int i = 1; i <= n; i++) {

            // Left-hand side pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  "); // Two spaces
            }

            // Right-hand side pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        
        // Create an instance of Solution14 class
        Solution19 sol = new Solution19();
        
        sol.pattern19(N);
    }
}
