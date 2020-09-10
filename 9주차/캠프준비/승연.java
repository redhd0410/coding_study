import java.util.*;
class Main{
    static int[] arr;
    static int N;
    static int L;
    static int R;
    static int X;
    static int answer =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        X = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        function(0,0,0,Integer.MAX_VALUE,0);
        System.out.println(answer);
    }
    public static void function(int index,int cnt,int max,int min,int sum){
        if(cnt>=2){
            if(sum>=L&&sum<=R&&max-min>=X){
                answer++;
            }
        }
        for(int i = index;i<N;i++){
            function(i+1,cnt+1,Math.max(max,arr[i]),Math.min(min,arr[i]),sum+arr[i]);
        }
    }
    
}
