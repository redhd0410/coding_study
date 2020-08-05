import java.util.*;
class Main{
    static class Rotation{
        int index;
        int first;
        int second;
        int twist;
        Rotation(int index,int first,int second, int twist){
            this.index = index;
            this.first = first;
            this.second = second;
            this. twist = twist;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        Rotation[] rotation = new Rotation[N+1];
        for(int i=1;i<=N;i++){
            int f = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            rotation[i] = new Rotation(i,f,s,t);
        }
        for(int i=1;i<=N;i++){
            if(rotation[i].twist==1){
                if(flag == false){
                    flag = true;//이전에 꼬여있지 않으면 꼬인것으로
                }else{
                    flag = false;
                }
            }
        }
        for(int i=2;i<=N;i++){
            int num = rotation[i-1].second/rotation[i].first;
            rotation[i].second = rotation[i].second*num;
        }
        if(flag == false){//꼬여있지 않음
            System.out.println("0 "+rotation[N].second);
        }else{
            System.out.println("1 "+rotation[N].second);
        }
    }
}
