import java.util.*;
class Main{
    static class Ball implements Comparable<Ball>{
        int color;
        int size;
        int index;
        Ball(int color,int size,int index){
            this.color = color;
            this.size = size;
            this.index = index;
        }
        public int compareTo(Ball b){
            return this.size-b.size;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] answer = new int[N+1];
        Ball[] ball = new Ball[N];
        int[] col = new int[N+1];
        for(int i=0;i<N;i++){
            int c = sc.nextInt();
            int s = sc.nextInt();
            ball[i] = new Ball(c,s,i);
        }
        Arrays.sort(ball);
        int cnt=0;
        for(int i=0,j=0;i<N;i++){
            while(ball[i].size>ball[j].size){
                cnt+=ball[j].size;
                col[ball[j].color]+=ball[j].size;
                j++;
            }
            answer[ball[i].index]=cnt - col[ball[i].color];
        }
        for(int i=0;i<N;i++){
            System.out.println(answer[i]);
        }
    }
}
