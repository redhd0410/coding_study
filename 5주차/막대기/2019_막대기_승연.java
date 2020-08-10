import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[N-1];
        int count =1;
        for(int i=N-2;i>=0;i--){
            if(max<arr[i]){
                max = arr[i];
                count+=1;
            }
        }
        System.out.println(count);
    }
}
