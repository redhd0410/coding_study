import java.util.*;
class Main{
    static int[][] arr1 = new int[5][5];
    static int[][] visited = new int[5][5];
    static int count =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr2 = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int tmp = arr2[i][j];
                if(check(tmp)){
                 return;   
                }
            }
        }
    }
    static boolean check(int num){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr1[i][j]==num){
                    visited[i][j]=1;
                    count++;
                }
            }
        }
        if(count>=5){
            int col=0,row=0,d=0;
            for(int i=0;i<5;i++){
                if(visited[i][0]==1&&visited[i][1]==1&&visited[i][2]==1&&visited[i][3]==1&&visited[i][4]==1){
                     col++;   
                }
                if(visited[0][i]==1&&visited[1][i]==1&&visited[2][i]==1&&visited[3][i]==1&&visited[4][i]==1){
                    row++;
                }
            }
            if(visited[0][0]==1&&visited[1][1]==1&&visited[2][2]==1&&visited[3][3]==1&&visited[4][4]==1){
                d++;
            }
            if(visited[0][4]==1&&visited[1][3]==1&&visited[2][2]==1&&visited[3][1]==1&&visited[4][0]==1){
                d++;
            }
            if(col+row+d>=3){
                System.out.println(count);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
