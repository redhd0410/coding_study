import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double[][] arr = new double[4][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        double mid =0.0;
        for(int i=0;i<3;i++){
            if(arr[i][0]!=arr[i][1]){
                mid =(arr[i][0]+arr[i][1])/2.0;
                if(mid<(N-mid)){
                    for(int j=i+1;j<3;j++){
                        for(int k=0;k<2;k++){
                            if(arr[j][k]<mid){
                                arr[j][k] += N - (mid*2);
                            }else{
                                arr[j][k] = N - (arr[j][k]);
                            }
                        }
                    }
                    N -=mid;
                }else{
                    for(int j=i+1;j<3;j++){
                        for(int k=0;k<2;k++){
                            if(arr[j][k]>mid){
                                arr[j][k] = mid - (arr[j][k]-mid);
                            }
                        }
                    }
                    N = mid;
                }
                
            }
        }
        System.out.println(N);
    }
}