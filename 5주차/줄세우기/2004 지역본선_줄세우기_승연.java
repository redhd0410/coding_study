import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+1];
        int[] arr = new int[N+1];
        for(int i=1;i<=N;i++){
            num[i]=i;
        }
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=N;i++){
            int number = arr[i];
            if(number==0){
                continue;
            }else{
                int index = i-number;//이동할 인덱스
                int tmp = num[i];
                for(int j=i;j>index;j--){
                    num[j]=num[j-1];//옮길 인덱스를 제외하고 한칸씩 뒤로
                }
                num[index]=tmp;
            }
        }
        for(int i=1;i<=N;i++){
            System.out.print(num[i]+" ");
        }
     }
}
