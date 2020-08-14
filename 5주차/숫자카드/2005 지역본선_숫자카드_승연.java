/*
dp사용
dp[i] = dp[i-1]과 dp[i-2]의 값을 사용하여 구해짐
*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()+1];
        int[] dp = new int[str.length()+2];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i)-'0';
        }
        dp[0]=1;//어떻게 숫자가 구성되어있든 1개의 배열구성은 무조건 나옴
        for(int i=0;i<str.length();i++){
            if(arr[i]!=0){
                dp[i+1]+=dp[i];//이전에 배치된 경우의 수에 새로 추가된 한자리수의 경우의 수를 더함
                if(arr[i]*10+arr[i+1]>=10&&arr[i]*10+arr[i+1]<=34){
                    //10이상인 이유는 두수인 경우만을 확인하기 위해 
                    //값이 허용된다면 후에 이전 경우의 수 값에 두수를 만든 경우의 수 값을 가져가야로함으로 
                    dp[i+2]+=dp[i];
                }
            }
        }
        System.out.println(dp[str.length()]);
    }
}
