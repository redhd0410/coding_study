import java.util.*;
class Main{
    static class People{
        int w;
        int k;
        People(int w ,int k){
            this.w = w;
            this.k = k;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        People[] p = new People[N];
        for(int i=0;i<N;i++){
            int w = sc.nextInt();
            int h = sc.nextInt();
            p[i] = new People(w,h);
        }
        int[] answer = new int[N];
        Arrays.fill(answer,1);
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(p[i].w>p[j].w&&p[i].k>p[j].k){
                    answer[j]++;
                }
                else if(p[i].w<p[j].w&&p[i].k<p[j].k){
                    answer[i]++;
                }else{
                    continue;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
