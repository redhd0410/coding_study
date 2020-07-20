import java.util.*;
class Main{
    static int N;
    static int[][] arr;
    static int[] t = new int[7];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N+1][7];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        t[1]=6;t[2]=4;t[3]=5;t[4]=2;t[5]=3;t[6]=1;
        int Max = 0;
        for(int i=1;i<=6;i++){
            Max = Math.max(Max,fun(i,1));
        }
        System.out.println(Max);
    }
    //num: 마주보는 면이 가진 숫자
    //h: 주사위의 높이
    public static int fun(int num, int h){
        int location=0;
        if(N<h) return 0;
        for(int i=1;i<=6;i++){
            if(arr[h][i]==num){
                location = i;
                break;
            }//마주보는 면을 결정
        }
        int tmp=0;
        for(int i=1;i<=6;i++){
            if(location==i||t[location]==i){
                continue;
            }
            if(tmp<arr[h][i]){
                tmp = arr[h][i];
            }//마주 보는 면을 제외하고 가장큰 옆면을 만들기 위해
        }
        return tmp+fun(arr[h][t[location]],h+1);
    }
}