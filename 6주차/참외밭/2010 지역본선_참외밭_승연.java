import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] arr = new int[6];
        int max_w = Integer.MIN_VALUE;
        int max_h = Integer.MIN_VALUE;
        for(int i=0;i<6;i++){
            int direct = sc.nextInt();
            arr[i] = sc.nextInt();
            if(direct==1||direct==2){
                max_w = Math.max(max_w,arr[i]);
            }
            if(direct==3||direct==4){
                max_h = Math.max(max_h,arr[i]);
            }
        }
        int w =0;
        int max_weight = max_w*max_h;
        for(int i=0;i<5;i++){
            w+=(arr[i]*arr[i+1]);
        }
        w+=arr[0]*arr[5];
        System.out.println((w-(max_weight*2))*K);
    }
}
