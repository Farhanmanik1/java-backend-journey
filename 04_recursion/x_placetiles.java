public class x_placetiles {

    public static int placetile(int n,int m){

        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }

        int vertical = placetile( n-m, m);
        int horizontal = placetile( n-1, m);

        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int total=placetile(100, 2);
        System.out.println(total);
        
    }
}
