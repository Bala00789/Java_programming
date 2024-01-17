public class Trapping_rainwater {
    public static void main(String[] args) {
        int[] arr={6,9,9};
        int count=0;
        int temp=0;
        int start=arr[0];
        for (int i=1;i<arr.length;i++){
            if(start>arr[i]){

                temp=start-arr[i];
                count+=temp;

            }

        }
        System.out.println(count);
    }
}
