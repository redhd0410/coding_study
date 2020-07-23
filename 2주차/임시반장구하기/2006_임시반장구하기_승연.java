import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[][] arr = new int[N+1][6];
        int[] count = new int[N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=5;k++){
                    if(i!=j){
                        if(arr[i][k]==arr[j][k]){
                            count[i]++;
                            break;
                        }//중복 방지(한사람과 같은 반을 여러 번한 경우 제외)
                    }
                }
            }
        }
        int answer=0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=N;i++){
            if(max<count[i]){
                max = count[i];
                answer=i;
            }else if(max==count[i]){
                if(answer<i){
                    continue;
                }
            }
        }
        System.out.println(answer);
       
    }
}