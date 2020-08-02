import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max_dist = 0, sum=0;
        for(int i=0;i<N;i++){
            int index = sc.nextInt();
            int count = sc.nextInt();
            hash.put(index,count);
            max_dist = Math.max(max_dist,index);
        }
        for(int i=0;i<S;i++){
            int tmp =0;
            if(hash.containsKey(i)){
                int j;
                for(j=i;j<S;j++){
                    if(hash.containsKey(j)){
                        tmp +=hash.get(j);
                        if(tmp>K){
                            hash.put(j,tmp-K);
                            j--;
                            break;
                        }
                    }
                }
                sum+=(S-i)*2;
                i=j;
            }
        }
        if(max_dist>S){
            for(int i=max_dist;i>S;i--){
                int tmp=0;
                if(hash.containsKey(i)){
                    int j;
                    for(j=i;j>S;j--){
                        if(hash.containsKey(j)){
                            tmp+=hash.get(j);
                            if(tmp>K){
                                hash.put(j,tmp-K);
                                j++;
                                break;
                            }
                        }
                    }
                    sum+=(i-S)*2;
                    i=j;
                }
            }
        }
        System.out.println(sum);
    }
}
