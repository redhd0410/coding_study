import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=N;i>0;i--){
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(N);
            tmp.add(i);
            int first = N;
            int second = i;
            while(true){
                int third = first-second;
                if(third<0) break;
                tmp.add(third);
                first = second;
                second = third;
            }
            if(tmp.size()>ans.size()){
                ans = tmp;
            }
        }
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}