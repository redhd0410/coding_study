import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//학생수
        int K = sc.nextInt();//방의 인원 최대
        int count = 0;//방의 개수를 세는 변수
        int[][] arr = new int[7][2];//학년과 성별에 따라 카운트하기 위해 선언
        for(int i=0;i<N;i++){
            int sex = sc.nextInt();
            int grade = sc.nextInt();
            arr[grade][sex]++;//해당 자리의 숫자증가
        }
        for(int i=1;i<=6;i++){
            for(int j=0;j<2;j++){
                int div = arr[i][j]/K;
                count+=div;
                int rest = arr[i][j]%K;
                if(rest!=0){
                    count+=1;//인원수 초과이므로 따로 방을 하나더 잡아줘야함
                }
            }
        }
        System.out.println(count);
    }
}
