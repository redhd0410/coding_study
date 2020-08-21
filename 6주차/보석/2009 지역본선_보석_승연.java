import java.util.*;
class Main{
    static int W;
    static int H;
    static int K;
    static int N;
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    static ArrayList<Point> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Point(a,b));
        }
        int max = 0;
        int x_index = 0;
        int y_index = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int x;
                int y;
                Point point1 = list.get(i);
                Point point2 = list.get(j);
                if(point1.x+K>W){
                    x = W-K;
                }else{
                    x = point1.x;
                }
                if(point2.y+K>H){
                    y = H-K;
                }else{
                    y = point2.y;
                }
                int ret = function(x,y);
                if(max<=ret){
                    max = ret;
                    x_index = x;
                    y_index = y+K;
                }
            }
        }
        System.out.println(x_index+" "+y_index);
        System.out.println(max);
    }
    public static int function(int x,int y){
        int count = 0;
        for(int i=0;i<N;i++){
            Point p = list.get(i);
            if(p.x>=x&&p.x<=x+K&&p.y>=y&&p.y<=y+K){
                count++;
            }
        }
         return count;
    }
}
