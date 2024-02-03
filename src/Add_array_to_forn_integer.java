public class Add_array_to_forn_integer {
    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9,9,9,9,9};
        int num_length=arr.length-1;
        int sum=0;
        for(int i=0;i<arr.length;i++){

            arr[i]=arr[i]*(int)Math.pow(10, num_length);
            num_length--;
            sum+=arr[i];
            //System.out.println(arr[i]);

        }
        
        System.out.println(sum);
    }
    
}
