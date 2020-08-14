import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        int C = A*(B.charAt(2)-'0');
        int D = A*(B.charAt(1)-'0');
        int E = A*(B.charAt(0)-'0');
        int F = A*Integer.parseInt(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
