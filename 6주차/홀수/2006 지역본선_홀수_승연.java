import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<7;i++){
            int num =sc.nextInt();
            if(num%2!=0){
                sum+=num;
                list.add(num);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
