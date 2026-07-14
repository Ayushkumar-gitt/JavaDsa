public class containerwithmostwater {
    public static void main() {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length-1;
        while (i<j){
            int width = j-i;
            int minValue = Math.min(height[i],height[j]);
            if (height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            if ((width*minValue)>ans){
                ans = width*minValue;
            }
        }
        return ans;
    }
}
