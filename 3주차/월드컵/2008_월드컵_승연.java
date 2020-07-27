import java.util.*;
class Main{
    static int[] g1 = {0,0,0,0,0,1,1,1,1,2,2,2,3,3,4};
    static int[] g2 = {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};
    //게임이 가능한 인덱스
    static int[] win = new int[6];
    static int[] draw = new int[6];
    static int[] lose = new int[6];
    static boolean flag = false;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String answer = "";
        for(int i=0;i<4;i++){
            flag = false;
            int win_sum = 0;
            int lose_sum = 0;
            int draw_sum = 0;
            for(int j=0;j<6;j++){
                win[j]=sc.nextInt();
                draw[j]=sc.nextInt();
                lose[j]=sc.nextInt();
                win_sum+=win[j];
                lose_sum+=lose[j];
                draw_sum+=draw[j];
            }
            if(win_sum+lose_sum+draw_sum!=30){
                flag=false;//총 경기수가 30이 아니면 불가능
            }else{
                function(0);
                //function은 게임이 가능한지 파악하는 함수 인수는 게임의 횟수 
            }
            if(flag) answer+="1 ";
            else answer+="0 ";
        }
        System.out.println(answer);
    }
    public static void function(int game){
        if(flag) return;
        if(game==15){
            flag = true;
            return;
        }// 두팀이 게임을 진행하므로 15번 진행하면 게임이 다 진행가능
        int t1 = g1[game];
        //게임의 횟수에 따른 게임을 진행하는 팀의 인덱스를 받아오는 변수
        int t2 = g2[game];
        if(win[t1]>0&&lose[t2]>0){
            win[t1]--;
            lose[t2]--;
            function(game+1);
            win[t1]++;
            lose[t2]++;
        }
        if(win[t2]>0&&lose[t1]>0){
            win[t2]--;
            lose[t1]--;
            function(game+1);
            win[t2]++;
            lose[t1]++;
        }
        if(draw[t1]>0&&draw[t2]>0){
            draw[t1]--;
            draw[t2]--;
            function(game+1);
            draw[t1]++;
            draw[t2]++;
        }
    }
}