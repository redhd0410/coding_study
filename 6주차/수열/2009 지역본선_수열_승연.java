import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] Dp_max = new int[N+1];
        int[] Dp_min = new int[N+1];
        int dp_max = Integer.MIN_VALUE;
        int dp_min = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.fill(Dp_max,1);
        Arrays.fill(Dp_min,1);
        for(int i=0;i<=N;i++){
            if(i+1<N){
                if(arr[i]<=arr[i+1]){
                    Dp_max[i+1] = Dp_max[i]+1; 
                }
                if(arr[i]>=arr[i+1]){
                    Dp_min[i+1] = Dp_min[i]+1;
                }
            }
            dp_max = Math.max(dp_max,Dp_max[i]);
            dp_min = Math.max(dp_min,Dp_min[i]);
        }
        ans = Math.max(dp_max,dp_min);
        System.out.println(ans);
    }
}

