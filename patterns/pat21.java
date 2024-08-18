class Solution21 {
    public void pattern21(int n) {

        //rows
        for(int i=1; i<=n; i++){

            //1st, last line
            if(i==1 || i==n){
                for(int j=0; j<n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int j=0; j<n-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }
        }

    }
    public static void main(String[] args) {
        int N = 5;
        
        // Create an instance of Solution class
        Solution21 sol = new Solution21();
        
        sol.pattern21(N);
    }
}