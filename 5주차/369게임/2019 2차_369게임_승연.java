import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        dp[0] =0;
        for(int i=1;i<=N;i++){
            int num = i;
            int count =0;
            while(num>0){
                if(num%10==3||num%10==6||num%10==9){
                    count++;
                }
                num = num/10;
            }
            dp[i] = dp[i-1]+count;
        }
        System.out.println(dp[N]);
    }
}
