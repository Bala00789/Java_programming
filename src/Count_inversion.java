public class Count_inversion {
    public static void main(String[] args) {

        int[] arr={2, 4, 1, 3, 5};
        int count=0;
        for(int i=0;i< arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]  &&  i<j){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
