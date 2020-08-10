import java.util.*;
class Main{
    static class Dot implements Comparable<Dot>{
        int position;
        int color;
        int min = Integer.MAX_VALUE;
        Dot(int position, int color){
            this.position = position;
            this.color = color;
        }
        @Override
        public int compareTo(Dot d){
            if(this.position>d.position){
                return -1;
            }
            else{
                return 1;
            }
        }
        public boolean sameColor(Dot d){
            return this.color == d.color;
        }
        public void changeMin(Dot d){
            int tmp = Math.abs(this.position-d.position);
            this.min = Math.min(this.min,tmp);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Dot>list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int p = sc.nextInt();
            int c = sc.nextInt();
            list.add(new Dot(p,c));
        }
        list.sort(Dot::compareTo);
        for(int i=0;i<N;i++){
            Dot d1 = list.get(i);
            for(int j=i+1;j<N;j++){
                Dot d2 = list.get(j);
                if(d1.sameColor(d2)){
                    d1.changeMin(d2);
                    d2.changeMin(d1);
                }
            }
        }
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+=list.get(i).min;
        }
        System.out.println(sum);
    }
}
