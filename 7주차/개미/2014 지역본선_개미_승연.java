import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();
        int newx = x+t;
        int newy = y+t;
        if(newx>w){
            int tmpx = newx/w;
            if(tmpx%2==0){
                newx = newx%w;    
            }else{
                newx = w - (newx%w);
            }
        }
        if(newy>h){
            int tmpy = newy/h;
            if(tmpy%2==0){
                newy = newy%h;
            }else{
                newy = h-(newy%h);
            }
        }
        System.out.println(newx+" "+newy);
    }
}
