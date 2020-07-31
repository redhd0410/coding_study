

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        int j=N-1;
        while(i<j){
            int tmp = Math.abs(arr[i]+arr[j]);
            if(min>tmp){
                    min = tmp;
                    answer[0] = arr[i];
                    answer[1] = arr[j];
            }
            if(arr[i]+arr[j]<0){
                i++;
            }else{
                j--;
            }
        }
        Arrays.sort(answer);
        System.out.print(answer[0]+" "+answer[1]);
    }
}
