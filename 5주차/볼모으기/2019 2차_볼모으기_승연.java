//전체 빨간볼의 개수에서 연속된 빨간볼의 개수를 빼면 하나로 모을수있는 이동횟수가 구해짐(파란볼도 동일)   
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int red_count =0,blue_count=0,count=0;
        int[] arr = new int[N];
        int answer=Integer.MAX_VALUE;
        String str = sc.next();
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='R'){
                red_count++;
                arr[i]=1;
            }else{
                blue_count++;
                arr[i]=2;
            }
        }
        if(red_count==N||blue_count==N){
            System.out.println("0");
            return;
        }
        int i=0;
        //red_forward
        while(arr[i]==1){
            count++;
            i++;
        }
        answer = Math.min(answer,(red_count-count));
        i=N-1;
        count=0;
        //red_backward
        while(arr[i]==1){
            count++;
            i--;
        }
        answer = Math.min(answer,(red_count-count));
        i=0;
        count=0;
        //blue_forward
        while(arr[i]==2){
            count++;
            i++;
        }
        answer = Math.min(answer,(blue_count-count));
        i=N-1;
        count=0;
        //blue_backward
        while(arr[i]==2){
            count++;
            i--;
        }
        answer = Math.min(answer,(blue_count-count));
        System.out.println(answer);
    }
}
