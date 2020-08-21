import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int[] answer = new int[N+1];
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=N;i++){
            arr[i]  = sc.nextInt();
            stack.add(arr[i]);
        }
        for(int i=N;i>=1;i--){
            int now = stack.pop();
            for(int j=i-1;j>=1;j--){
                if(arr[j]>=now){
                    answer[i] =j;
                    break;
                }
            }
        }
        for(int i=1;i<=N;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
