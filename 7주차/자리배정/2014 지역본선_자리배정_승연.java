import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int K = sc.nextInt();
        if(C*R<K){
            System.out.println("0");
            return;
        }
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int[][] arr = new int[R+1][C+1];
        int cnt =1;
        int x = R;
        int y = 1;
        int d =0;
        arr[x][y] = cnt;
        while(cnt<K){
            int newx = x+dx[d];
            int newy = y+dy[d];
            if(newx<=0||newx>R||newy<=0||newy>C||arr[newx][newy]!=0){
                d = (d+1)%4;
                continue;
            }
            arr[newx][newy]=cnt;
            cnt++;
            y = newy;
            x = newx;
        }
        System.out.println(y+ " "+(R-x+1));
    }
}
