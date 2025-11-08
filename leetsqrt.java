public class leetsqrt {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        
        if (x==0||x==1) {
            return x;
        }
        while (start<=end) {
            int mid = (start+end)/2;
            long square =(long) mid*mid;
            if (square==x ) {
                return mid;
            }else if(square<x){
                ans = mid;
                start = mid+1;
            }else if (square>x) {
                end = mid-1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        System.out.println(mySqrt(9));
    }
}
