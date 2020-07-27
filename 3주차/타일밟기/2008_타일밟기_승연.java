import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        long answer =0;
        Long[][] dp = new Long[3001][3001];
        HashMap<Integer,Integer> hash = new HashMap<>();
        //Key: 값 value: 값의 인덱스
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            hash.put(arr[i],i);
        }
        for(int i=1;i<N;i++){
            int cur = arr[i];
            for(int j=0;j<i;j++){
                int prev = arr[j];
                int next = cur+(cur-prev);
                if(hash.containsKey(next)){
                    int next_index = hash.get(next);
                    dp[next_index][i]=(long)(next+prev+cur);
                    answer = Math.max(answer,dp[next_index][i]);
                }
            }
        }
        for(int i=1;i<N;i++){
            int cur = arr[i];
            for(int j=0;j<i;j++){
                int prev = arr[j];
                int next = cur+(cur-prev);
                if(hash.containsKey(next)){
                    if(dp[i][j]!=null){
                    int next_index = hash.get(next);
                    dp[next_index][i]=(dp[i][j]+next);
                    answer = Math.max(answer,dp[next_index][i]);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}