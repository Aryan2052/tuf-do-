class Solution2 {
    public void pattern2(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args){
        int N = 5;

        Solution2 sol = new Solution2();
        sol.pattern2(N);
    }
}