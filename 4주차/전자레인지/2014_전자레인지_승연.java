import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] answer = new int[3];
        int[] time = new int[3];
        time[0]=300;time[1]=60;time[2]=10;
        for(int i=0;i<3;i++){
            answer[i] = N/time[i];
            N = N%time[i];
            if(N==0){
                break;
            }
            if(N!=0&&i==2){
                System.out.println("-1");
                return;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
