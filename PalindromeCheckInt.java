public class PalindromeCheckInt {
    public static void main(String[] args) {
        int arr = -121;
        System.out.println(isPalindrome(arr));
    }
    public static boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }

        int temp = x;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] arr = new int[count];
        int ans = 0;
        for(int i = arr.length-1;i>=0;i--){
            ans = x%10;
            arr[i] = ans;
            x = x/10;
        }
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
