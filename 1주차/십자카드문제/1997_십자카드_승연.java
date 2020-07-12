import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int cnt =0;
        int num =0;
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        num = fun(arr[0]*1000+arr[1]*100+arr[2]*10+arr[3]);
        //현재 받은수가 가진 수들로 만들 수 있는 최소 수인지 확인함
        for(int i=1111;i<=num;i++){
            if(fun(i)==i){
                cnt++;//수가 최소 수이면 카운트
            }
        }
        System.out.println(cnt);
    }
    static int fun(int num){
        int min = num;
        for(int i=0;i<3;i++){
            num = (num%1000)*10+(num/1000);//한자리씩 앞칸으로 이동하며 수를 만들어 확인
            if(num<min){
                min = num;
            }
        }
        return min;
    }
}
