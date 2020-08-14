import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int[] arr = new int[7];
        for(int i=1;i<7;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[6]!=0){
            ans = arr[6];
        }
        while(arr[5]>0){
            arr[5]--;
            if(arr[1]>0){
                arr[1]-=11;
            }
            if(arr[1]<0) arr[1] =0;
            ans++;
        }
        while(arr[4]>0){
            arr[4]--;
            if(arr[2]>=5){
                arr[2]-=5;
            }else{
                arr[1] -= 20-(arr[2]*4);
                arr[2] = 0;
            }
            if(arr[1]<0) arr[1]=0;
            ans++;
        }
        while(arr[3]>0){
            if(arr[3]>=4){
                arr[3]-=4;
            }
            else if(arr[3]>=3){
                arr[3]-=3;
                if(arr[2]>0){
                    arr[2] -=1;
                    arr[1] -=5;
                }else{
                    arr[1] -=9;
                }
            }else if(arr[3]>=2){
                arr[3]-=2;
                if(arr[2]>=3){
                    arr[2]-=3;
                    arr[1] -=6;
                }else{
                    arr[1] -= 18-(arr[2]*4);
                    arr[2] =0;
                }
            }else{
                arr[3]--;
                if(arr[2]>=5){
                    arr[2] -=5;
                    arr[1]-=7;
                }else{
                    arr[1] -= 27-(arr[2]*4);
                    arr[2]=0;
                }
            }
            if(arr[2]<0) arr[2]=0;
            if(arr[1]<0) arr[1]=0;
            ans++;
        }
        ans += (arr[2]*4+arr[1])/36;
        if((arr[2]*4+arr[1])%36!=0){
            ans++;
        }
        System.out.println(ans);
    }
}
