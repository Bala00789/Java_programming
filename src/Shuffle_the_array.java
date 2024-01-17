import java.util.Arrays;

public class Shuffle_the_array {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] arr=new int[nums.length];
        int initial=0;
        for(int i=0;i<n;i++){
            arr[initial]=nums[i];
            initial+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
