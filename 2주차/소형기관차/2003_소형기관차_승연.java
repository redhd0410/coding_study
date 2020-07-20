import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+2];
        int[] sum = new int[N+2];
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
            sum[i] = sum[i-1]+arr[i];//순차적으로 더한값
        }
        int K =sc.nextInt();//소형기관차 연결 개수
        int[][] dp = new int[4][N+1];
        dp[1][1] = arr[1];
        for(int i=1;i<4;i++){
            for(int j=i*K;j<N+1;j++){//이전 연결을 제외하기 위해
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j-K]+sum[j]-sum[j-K]);
                //sum[j]-sum[j-k]의 이유: 두개의 소형기관차를 제외한 값을 없애기위해
                //dp[i-1][j-K]와 더한값인 이유: 이전 소형기관차에서 연결한 값중의 최대임으로
            }
        }
        System.out.println(dp[3][N]);
    }
}