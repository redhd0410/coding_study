import java.util.*;
class Main{
    static class Station implements Comparable<Station>{
        int sender;
        int receiver;
        int box;
        Station(int sender, int receiver, int box){
            this.sender = sender;
            this.receiver = receiver;
            this.box = box;
        }
        @Override
        public int compareTo(Station s){
            if(this.receiver>s.receiver){
                return 1;
            }else return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();
        Station[] station = new Station[M];
        int[] ok = new int[N];//station sender가 넣은 박스량
        int sum = 0;
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            station[i] = new Station(s,r,b);
        }
        Arrays.sort(station);
        for(int i=0;i<M;i++){
            int bcount =0;  
            Station s = station[i];
            for(int j = s.sender;j<s.receiver;j++){
                if(ok[j]>bcount){ 
                    bcount = ok[j];
                }
            }
            int can_box = Math.min(C-bcount,s.box);
            for(int j=s.sender;j<s.receiver;j++){
                ok[j]+=can_box;// 같은 sender에서 트럭에 넣은 박스량 더해줌
            }
            sum+=can_box;
        }
        System.out.println(sum);
    }
}
