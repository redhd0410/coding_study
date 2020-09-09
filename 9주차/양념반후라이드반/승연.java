import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int money = Integer.MAX_VALUE;
        if(X>Y){
            for(int i=0;i<=Y;i++){
                money = Math.min(money,(C*2*i)+B*(Y-i)+A*(X-i));
            }
        }else{
            for(int i=0;i<=X;i++){
                money = Math.min(money,(C*2*i)+B*(Y-i)+A*(X-i));
            }    
        }
        money = Math.min(money,Math.max(X,Y)*2*C);
        money = Math.min(money,A*X+B*Y);
        System.out.println(money);
    }
}
