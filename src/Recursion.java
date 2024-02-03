public class Recursion {
    public static int recur(int n){
        if(n==0){
            return 0;
        }
        else if(n<=2){
            return 1;
        }
        return recur(n-1)+recur(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Recursion.recur(7));
    }
}
