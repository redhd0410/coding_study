import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//구간수
        int K = sc.nextInt();//최대시간
        int[][] dp = new int[N][K+1];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int a = sc.nextInt();//도보시간
            int b = sc.nextInt();//도보 모금액
            int c = sc.nextInt();//자전거 시간
            int d = sc.nextInt();//자전거 모금액
            if(i==0){
                dp[i][a]=b;
                dp[i][c]=Math.max(dp[i][c],d);
            }else{
                for(int j=0;j<=K;j++){
                    if(dp[i-1][j]!=0){
                        if(j+a<=K){//진전이 가능하면
                            dp[i][j+a]=Math.max(dp[i-1][j]+b,dp[i][j+a]);  
                        }
                        if(j+c<=K){
                            dp[i][j+c]=Math.max(dp[i-1][j]+d,dp[i][j+c]);
                        }
                    }   
                }
            }
        }
        for(int i=0;i<=K;i++){
            max=Math.max(max,dp[N-1][i]);
        }
        System.out.println(max);
    }
}
