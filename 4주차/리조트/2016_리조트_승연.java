/*dp*/
import java.util.*;
class Main{
    static int N;//여름방학수
    static int M;//안가는 날의 수
    static int[][] dp = new int[103][103];
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N+1];
        for(int i=0;i<M;i++){
            int no = sc.nextInt();
            arr[no] = 1;
        }
        int answer = fun(1,0,0);
        System.out.println(answer);
    }
    static int fun(int day, int price, int coupon){
        if(day>N) return price;
        if(arr[day]==1) return fun(day+1,price,coupon);//안가는 날이라면 날짜만 증가
        if(dp[day][coupon]!=0) return dp[day][coupon]+price;//이전에 계산된 날짜와 쿠폰수라면 현재 가격을 더해줌
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans,fun(day+1,price+10000,coupon));
        ans = Math.min(ans,fun(day+3,price+25000,coupon+1));
        ans = Math.min(ans,fun(day+5,price+37000,coupon+2));
        if(coupon>=3){
            ans = Math.min(ans, fun(day+1,price,coupon-3));
        }//쿠폰이 3개 이상이면 쿠폰사용으로 하루증가와 쿠폰수 업데이트
        dp[day][coupon] = ans- price;//날짜와 쿠폰수가 동일한 경우가 발생했을 때를 대비하여 현재 계산한 비용은 제거해줌
        return ans;
    }
}
