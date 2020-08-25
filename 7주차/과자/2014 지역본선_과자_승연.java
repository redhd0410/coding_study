import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int money = K*N;
        int answer = M - money;
        if(answer>0){
            System.out.println("0");
        }
        else{
            System.out.println(Math.abs(answer));
        }
    }
}
