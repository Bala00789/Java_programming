public class Happy_Number {
    public static void main(String[] args) {
        int n=19;
        int rem=0;
        while(n!=1){
            rem=n%10;
            n=n/10;

            n=(int)Math.pow(rem,2) + (int)Math.pow(n,2);
        }
        System.out.println(n);
    }
}
