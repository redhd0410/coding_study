import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum =0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        int max_money = sc.nextInt();
        Arrays.sort(arr);
        int min =0;
        int max = arr[N-1];
        if(sum<=max_money){
            System.out.println(max);
        }else{
            while(min<max){
                int mid = (max+min)/2;
                int tmp =0;
                for(int i=0;i<N;i++){
                    if(mid<arr[i]){
                        tmp+=mid;
                    }else{
                        tmp+=arr[i];
                    }
                }
                if(tmp>max_money){
                    max = mid;
                }else{
                    min = mid+1;
                }
            }
            System.out.println(min-1);
        }
    }
}
