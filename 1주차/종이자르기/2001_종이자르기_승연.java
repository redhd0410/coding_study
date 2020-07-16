import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        int K = sc.nextInt();
        for(int i=0;i<K;i++){
            int flag = sc.nextInt();
            int num = sc.nextInt();
            if(flag==1){
                width.add(num);
            }else{
                height.add(num);
            }
        }
        width.add(N);
        height.add(M);
        Collections.sort(width);
        Collections.sort(height);
        ArrayList<Integer> width_length = new ArrayList<>();
        ArrayList<Integer> height_length = new ArrayList<>();
        width_length.add(width.get(0));
        height_length.add(height.get(0));
        for(int i=1;i<width.size();i++){
            width_length.add(width.get(i)-width.get(i-1));
        }
        for(int i=1;i<height.size();i++){
            height_length.add(height.get(i)-height.get(i-1));
        }
        Collections.sort(width_length);
        Collections.sort(height_length);
        System.out.println(width_length.get(width_length.size()-1)*height_length.get(height_length.size()-1));
    }
}