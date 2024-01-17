import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Next_greater {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        long[] a=new long[arr.length];

        for(int i=0;i<= arr.length-2;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    a[i]=arr[j];
                    break;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            if(a[k]==0){
                a[k]=-1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
