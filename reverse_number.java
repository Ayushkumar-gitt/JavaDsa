public class reverse_number {
    public static void main(String[] args) {
        int num = 123456;
        for(int i = 0;num>0;i++){
            int rem = num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}
