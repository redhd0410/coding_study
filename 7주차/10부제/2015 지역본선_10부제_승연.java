import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int cnt =0;
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            if(num==N){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
