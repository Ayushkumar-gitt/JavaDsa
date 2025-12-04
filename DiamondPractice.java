public class DiamondPractice {
    public static void main(String[] args) {
        diamondPr(4);
    }
    public static void diamondPr(int size){
        for(int i = 1;i<=size-1;i++){ // Extra minus 1 at size cause double middle line was comming
            // spaces
            for(int j = 1;j<=size-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // second half
        for(int i = size;i>0;i--){
            // spaces
            for(int j = 1;j<=size-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
