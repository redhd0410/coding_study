import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] x_point = new int[M];
        int[] y_point = new int[M];
        for(int i=0;i<M;i++){
            x_point[i] = sc.nextInt();
            y_point[i] = sc.nextInt();
        }
        Arrays.sort(x_point);
        Arrays.sort(y_point);
        int div = M/2;
        int answer =0;
        for(int i=0;i<M;i++){
            answer+=Math.abs(x_point[i]-x_point[div])+Math.abs(y_point[i]-y_point[div]);
        }
        System.out.println(answer);
    }
}
