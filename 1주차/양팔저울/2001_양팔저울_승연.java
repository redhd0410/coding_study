import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] chu = new int[N+1];
        int[] dp = new int[40501];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            chu[i] = sc.nextInt();
            int size = list.size();
            list.add(chu[i]);
            dp[chu[i]]=1;
            if(size!=0){
                for(int j=0;j<size;j++){
                    if(dp[Math.abs(chu[i]-list.get(j))]==0){
                        dp[Math.abs(chu[i]-list.get(j))]=1;
                        list.add(Math.abs(chu[i]-list.get(j)));
                    }
                    if(dp[chu[i]+list.get(j)]==0){
                        dp[chu[i]+list.get(j)]=1;
                        list.add(chu[i]+list.get(j));
                    }
                }
            }
        }
        
        int K = sc.nextInt();
        int[] marble = new int[K+1];
        for(int i=0;i<K;i++){
            marble[i] = sc.nextInt();
        }
        for(int i=0;i<K;i++){
            if(dp[marble[i]]==1){
                System.out.print("Y ");
            }else{
                System.out.print("N ");
            }
        }
    }
}