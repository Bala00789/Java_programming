public class ncr {
    public static void main(String[] args) {
        int n=3,r=2;
        int temp=n;
        int numerator=1;
        while(n!=0){
            numerator*=temp;
            temp--;
        }
        int denominator=1;
        int nr=n-r;
        while (nr!=0) {
            denominator*=nr;
            nr--;
        }
        int rr=1;
        while(r!=0){
            rr*=r;
            r--;
        }
        //System.out.println(numerator);
        System.out.println(denominator);
        //System.out.println(rr);
    }
    
}
