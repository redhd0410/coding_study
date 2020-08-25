import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int m = sc.nextInt();
        int cooking_time = sc.nextInt();
        m = m+cooking_time;
        hour += m/60;
        m = m%60;
        if(hour>23){
            hour = hour%24;
        }
        System.out.println(hour+" "+m);
    }
}
