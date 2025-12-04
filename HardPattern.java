public class HardPattern {
    public static void main(String[] args) {
        // HardPatternques();
        charPattern();
    }
    public static void HardPatternques() {
        int n = 7;

        for (int i = 1 ; i <=n; i++) {
            for(int j = 1;j<=n;j++){
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("4 ");
                }
                if (i==2||j!=1&&j!=n) {
                    System.out.print("3");
                }
                
            }
            System.out.println();
        }
    }

    public static void charPattern() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            char startChar = (char)('E' - i );
            for (char ch = startChar; ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
