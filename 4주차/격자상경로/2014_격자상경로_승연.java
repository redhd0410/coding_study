import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[][] dp = new int[N][M];
        int sum = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                dp[i][j]=1;
            }
        }
        if(K==0){
            for(int i=1;i<N;i++){
                for(int j=1;j<M;j++){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
            sum = dp[N-1][M-1];
        }else{
            int x = K/M;
            int y = (K%M)-1;
            if(K%M==0){
                x = x-1;
                y = M-1;
            }
            for(int i=1;i<=x;i++){
                for(int j=1;j<=y;j++){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
            for(int i=x+1;i<N;i++){
                for(int j=y+1;j<M;j++){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
            sum = dp[x][y]*dp[N-1][M-1];
        }
        System.out.println(sum);
    }
}
