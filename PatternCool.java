public class PatternCool {
    public static void main(String args[]) {
        for (int i=0; i<5; i++) {
            boolean flag = (i%2==0)? true : false; 
            for (int j=0; j<i; j++) {
                System.out.print((flag)? "0" : "1");
                flag = !flag;
            }
            
            System.out.println();
        }
    }
}