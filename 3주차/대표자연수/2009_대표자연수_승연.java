import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] sum = new int[N];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            int num = arr[i];
            for(int j=0;j<N;j++){
                sum[i]+=Math.abs(num-arr[j]);
            }
            min = Math.min(sum[i],min);
        }
        for(int i=0;i<N;i++){
            if(min==sum[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}