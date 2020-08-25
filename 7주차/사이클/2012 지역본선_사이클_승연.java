import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(N);
        int num = N;
        while(true){
            num = (num*N)%P;
            for(int i=0;i<list.size();i++){
                if(list.get(i)==num){
                    int count = list.size() - i;
                    System.out.println(count);
                    return;
                }
            }
            list.add(num);
        }
    }
}
