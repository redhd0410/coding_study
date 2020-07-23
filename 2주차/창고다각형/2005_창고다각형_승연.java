/*백트래킹*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        int nx=0;
        int maxIndex = 0;
        int index =0;
        int answer=0;
        for(int i=0;i<N;i++){
           arr[i][0] = sc.nextInt();
           arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,new Comparator<int[]>(){
           public int compare(int[] o1,int[] o2){
               return o1[0]-o2[0];
           } 
        });
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0;i<N;i++){
            if(stack.peek()<arr[i][1]){
                stack.pop();
                maxIndex = i;
                stack.push(arr[i][1]);
            }
            int x = arr[i][0];
            if(i==N-1)nx=x+1;
            else nx = arr[i+1][0];
            for(int j=x;j<nx;j++){
                answer+=stack.peek();
            }
        }
        if(arr[N-1][1]<stack.peek()){
            index=N-1;
            for(int i=N-1;i>=maxIndex;i--){
                if(arr[i][1]>arr[index][1]){
                    for(int j=arr[i][0];j<arr[N-1][0];j++){
                        answer-=arr[i][1]-arr[index][1];
                    }
                    index=i;
                }
            }
        }
        System.out.println(answer);
    }
}