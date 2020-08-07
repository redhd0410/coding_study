import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int[] answer = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=i;
        }
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a]++;
            arr[b]--;
        }
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<=N;j++){
                if(arr[i]==arr[j]){
                    System.out.println("-1");
                    return;
                }
            }
            if(arr[i]>N||arr[i]<0){
                System.out.println("-1");
                    return;
            }
                
        }
        for(int i=1;i<=N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
