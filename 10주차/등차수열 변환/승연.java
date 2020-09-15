import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int[] arr = new int[N];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        if(N==1){
            System.out.println("0");
            return;
        }
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int cnt = 0;
                num=arr.clone();
                if(i!=0) cnt++;
                if(j!=0) cnt++;
                boolean success=true;
                num[0]+=i;
                num[1]+=j;
                int diff = num[1]-num[0];
                for(int k=2;k<N;k++){
                    int cur_diff = num[k]-num[k-1];
                    boolean flag = false;
                    for(int q =-1;q<=1;q++){
                        if(cur_diff+q==diff){
                            if(q!=0)cnt++;
                            num[k]+=q;
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        success = false;
                        break;
                    }
                }
                if(success){
                    ans = Math.min(ans,cnt);
                }
            }
        }
        if(ans==Integer.MAX_VALUE){
            System.out.println("-1");
            return;
        }
        System.out.println(ans);
    }
}
