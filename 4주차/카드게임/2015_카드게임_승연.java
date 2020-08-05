import java.util.*;
class Main{
    static int[] A;
    static int[] B;
    static int[][] dp;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        dp = new int[N+1][N+1];
        for(int i=0;i<N+1;i++){
            for(int j=0;j<N+1;j++){
                dp[i][j]=-1;//-1로 초기화 점수가 0일 수 있으므로 
            }
        }
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        for(int i=0;i<N;i++) B[i] = sc.nextInt();
        
        int answer = fun(0,0);
        System.out.println(answer);
    }
    //최대 점수 구하기 위한 함수 
    //파라미터는 a는 A의 인덱스 b는 B의 인덱스
    public static int fun(int a, int b){
        if(a==N||b==N) return 0;//남는 카드가 없기 때문에 점수를 계산해야함
        if(dp[a][b]!=-1) return dp[a][b];//이미 계산했던 경우
        dp[a][b] = Math.max(fun(a+1,b),fun(a+1,b+1));//둘다 버리거나 왼쪽만 버리는 경우
        if(A[a]>B[b]){//오른쪽만 버리거나 아니거나 중 점수가 큰것
            dp[a][b] = Math.max(fun(a,b+1)+B[b],dp[a][b]);
        }
        return dp[a][b];//주어진 인덱스 상에서 나올수 있는 최대 점수 
    }
}
