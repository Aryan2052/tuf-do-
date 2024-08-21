public class pat13 {
    public void pattern13(int n) {

        int k =1;

        //rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        pat13 sol = new pat13();

        sol.pattern13(N);
    }
}
