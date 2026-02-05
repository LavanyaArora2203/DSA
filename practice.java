public class practice {
    //fibonacci by recursion--->O(2^n)
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void fib2(int n){//linear TC O(n)
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<n;i++){
            int f=a+b;
            System.out.println(f);
            a=b;
            b=f;

        }
    }

    public double myPow(double x, int n) {  //iterative-->O(n)-->correct but not acceptable for large n

        int m=Math.abs(n);
        double ans=1;
        for(int i=0;i<m;i++){
            ans*=x;
        }
        if(n<0){
            ans=1/ans;
        }
        
        return ans;
    }

    // public static double myPow2(double x,int n){ //binary approach-->O(nlogn)
    //     return x*n;
    // }


}
