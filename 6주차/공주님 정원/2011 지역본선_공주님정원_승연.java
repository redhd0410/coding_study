import java.util.*;
class Main{
    static class Flower implements Comparable<Flower>{
        int start;
        int end;
        Flower(int start,int end){
            this.start = start;
            this.end = end;
        }
        public int compareTo(Flower f){
            if(this.start>f.start){
                return 1;
            }else if(this.start==f.start){
                if(this.end>f.end){
                    return 1;
                }else if(this.end<f.end){
                    return -1;
                }
            }else if(this.start<f.start){
                return -1;
            }
            return 0;
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Flower[] flower = new Flower[N];
     
        for(int i=0;i<N;i++){
            int sm = sc.nextInt();
            int sd = sc.nextInt();
            int em = sc.nextInt();
            int ed = sc.nextInt();
            flower[i] = new Flower(sm*100+sd,em*100+ed);
        }
        Arrays.sort(flower);
        int index =-1;
        int end =0;
        int cnt =0;
        int now=301;
        for(int i=0;i<N;i++){
            if(now>1130) break;
            if(flower[i].start<=now&&end<flower[i].end){
                end = flower[i].end;
                index =i;
            }
            if(flower[i].start>now&&end!=0){
                now = flower[index].end;
                cnt++;
                end=0;
                i--;
            }else if(end!=0&&i==N-1){
                if(index!=-1){
                    cnt++;
                    now = flower[index].end;
                    break;
                }
            }else if(end==0){
                cnt=0;
                break;
            }
        }
        
        if(now<=1130){
            cnt=0;
        }
        System.out.println(cnt);
    }
}
