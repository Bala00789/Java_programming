import java.util.Arrays;

public class Highest_altitude {
    public static String largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<gain.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        return Arrays.toString(arr);

    }

    public static void main(String[] args) {
        String a=Highest_altitude.largestAltitude(new int[]{-5,1,5,0,-7});
        System.out.println(a);
    }
}
