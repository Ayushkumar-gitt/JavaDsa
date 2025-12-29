public class int_digi_count {
    public static void main(String[] args) {
        int a = 5678;
        int sum =0;
        
        for(;a!=0;a/=10){
            int b = a%10;
            sum+=b;
            System.out.println(sum);

        }
        
    }

}
