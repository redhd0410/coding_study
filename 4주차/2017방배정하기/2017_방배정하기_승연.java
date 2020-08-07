/*완전 탐색 문제*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int N = sc.nextInt();
        for(int i=0;i<=50;i++){
            for(int j=0;j<=50;j++){
                for(int k=0;k<=50;k++){
                    if((i*a)+(j*b)+(k*c)==N){
                        System.out.print("1");
                        return;
                    }
                }
            }
        }
        System.out.println("0");
    }
}
