import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1][5];
        int maxvalue = 0;
        int[] max = new int[N+1];
        for(int i=1;i<N+1;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<N+1;i++){
            for(int j=0;j<5;j++){
                for(int k=j+1;k<5;k++){
                    for(int q = k+1;q<5;q++){
                        max[i] = Math.max(max[i],(arr[i][j]+arr[i][k]+arr[i][q])%10);
                    }
                }
            }
            maxvalue=Math.max(maxvalue,max[i]);
        }
        int answer = 0;
        for(int i=1;i<N+1;i++){
            if(maxvalue == max[i]){
                answer =i;
            }
        }
        System.out.println(answer);
    }
}