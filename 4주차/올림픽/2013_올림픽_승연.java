import java.util.*;
class Main{
    static class Nation implements Comparable<Nation>{
        int index;
        int gold;
        int silver;
        int bronze;
        int rank;
        Nation(int index,int gold, int silver, int bronze){
            this.index = index;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 1;
        }
        @Override
        public int compareTo(Nation n){
            if(this.gold>n.gold){
                return -1;
            }else if(this.gold==n.gold){
                if(this.silver>n.silver){
                    return -1;
                }else if(this.silver==n.silver){
                    if(this.bronze>n.bronze){
                        return -1;
                    }
                }
            }
            return 1;
        } 
    }
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        Nation[] nation = new Nation[N];
        for(int i=0;i<N;i++){
            int n = sc.nextInt();
            int g = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();
           nation[i] = new Nation(n,g,s,b);
        }
        Arrays.sort(nation);
        ranking(nation);
        
        for(int i=0;i<N;i++){
            if(nation[i].index==K){
                System.out.println(nation[i].rank);
            }
        }
    }
    public static void ranking(Nation[] n){
        for(int i=1;i<N;i++){
            if(n[i].gold==n[i-1].gold&&n[i].silver==n[i-1].silver&&n[i].bronze==n[i-1].bronze){
                n[i].rank = n[i-1].rank;
            }else{
                n[i].rank = i+1;
            }
        }
    }
}
