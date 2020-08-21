import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int money =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b&&b==c){
                money = 10000+a*1000;
            }else if(a==b||b==c||c==a){
                if(a==b){
                    money = 1000+a*100;
                }else if(b==c){
                    money = 1000+b*100;
                }else{
                    money = 1000+c*100;
                }
            }else{
                int d = Math.max(a,Math.max(b,c));
                money = d*100;
            }
            max = Math.max(money,max);
        }
        System.out.println(max);
    }
}
