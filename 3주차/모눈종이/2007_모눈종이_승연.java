import java.util.*;
class Main{
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int paper = sc.nextInt();
        int K = sc.nextInt();
        int len =0;
        for(int i=0;i<K;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            len = Math.max(len, x);//기준으로 할 x의 가장 긴 변을 찾는다
            list.add(y);
        }
        Collections.sort(list);
        int r =1000000;//행과 열이 가지는 최대 갯수 즉, y
        while(len<r){
            int mid = (len+r)/2;
            if(need_paper(mid)<=paper){
                /*
                    해당 길이로 했을 때 필요한 종이수가 주어진 종이수보다 작거나 같을 때 
                    y의 길이를 줄여야함
                */
                r = mid;
            }else{
                /*
                    종이의 갯수 더 많으므로 x의 길이를 늘려야함
                */
                len = mid+1;
            }
        }
        System.out.println(len);
    }
    static int need_paper(int mid){
        int prev = -1;
        int answer = 0;
        for(int i=0;i<list.size();i++){
            if(prev==-1){
                prev = list.get(i);
                answer++;
            }else if(prev+mid<=list.get(i)){
                prev = list.get(i);
                answer++;
            }
        }
        return answer;
    }
}