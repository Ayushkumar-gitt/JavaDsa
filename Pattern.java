public class Pattern {
    public static void main(String[] args) {
        piramid(4);
    }
    public static void piramid(int n){
        for (int i = 0; i <=n; i++) {
            // spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            } 
            //stars
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
