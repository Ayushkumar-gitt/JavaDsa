public class OnetoFive {
    public static void main(String[] args) {
        onetofive(5);
    }
    public static void onetofive(int n){
        if (n==1) {
            System.out.println(1) ;return;
        };
        onetofive(n-1);
        System.out.println(n);
    }
}
