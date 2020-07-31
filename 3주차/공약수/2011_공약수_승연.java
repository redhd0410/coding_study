import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long mul = (long)N*(long)M;
        int a =0,b=0,c=0,d=0;
        int min = Integer.MAX_VALUE;
        for(long i=N;i*i<=mul;i+=N){
            if(mul%i!=0){
                continue;
            }//주어진 수로 최대,최소를 만들수없음 
            a = (int)i;
            b = (int)(mul/i);
            int tmp = gcd(a,b);
            if(tmp!=N||mul/(long)tmp!=M){
                continue;
            }//주어진 수가 최대공약수와 최소공배수가 아니므로
            else if(min>a+b||(c+d==0)){
                min = a+b;
                c = a;
                d = b;
            }
        }
        System.out.println(c+" "+d);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
