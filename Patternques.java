public class Patternques {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //Spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  "); // Added double space for good space indetation , was getting spacing problem when adding only one 
            }
            // nums
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
    }
}
