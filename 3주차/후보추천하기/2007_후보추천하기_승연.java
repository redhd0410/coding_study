import java.util.*;
class Main{
    static class Student implements Comparable<Student>{
        int index;
        int count;
        Student(int index,int count){
            this.index = index;
            this.count = count;
        }
        @Override
        public int compareTo(Student s){
            if(this.index>s.index){
                return 1;
            }else return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(new Student(0,0));
        }
        while(M>0){
            M--;
            boolean flag = false;
            int num = sc.nextInt();
            for(int i=0;i<list.size();i++){
                if(list.get(i).index==num){
                    list.get(i).count++;
                    flag = true;
                }
            }
            if(flag) continue;
            int Min = Integer.MAX_VALUE;
            list.add(new Student(num,1));
            for(int i=0;i<list.size()-1;i++){
                if(Min>list.get(i).count){
                    Min=list.get(i).count;
                }
            }
            for(int i=0;i<list.size()-1;i++){
                if(Min==list.get(i).count){
                    list.remove(i);
                    break;
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<N;i++){
            System.out.print(list.get(i).index+" ");
        }
    }
}