import java.util.*;
class Main{
    static class Dot{
        int direction;
        int dist;
        Dot(int direction, int dist){
            this.direction = direction;
            this.dist = dist;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Dot> list = new ArrayList<>();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int d = sc.nextInt();
            int p = sc.nextInt();
            list.add(new Dot(d,p));
        }
        int dong_direction = sc.nextInt();
        int dong_dist = sc.nextInt();
        int sum = 0;
        for(int i=0;i<N;i++){
            Dot dot = list.get(i);
            if(dot.direction==1){
                if(dong_direction==1){
                    sum+=Math.abs(dot.dist-dong_dist);
                }else if(dong_direction==2){
                    int tmp1 = height;
                    int tmp2 = height;
                    tmp1+=(dong_dist+dot.dist);
                    tmp2+=(width-dong_dist)+(width-dot.dist);
                    sum+=Math.min(tmp1,tmp2);
                }else if(dong_direction==3){
                    sum+=(dong_dist+dot.dist);
                }else{
                    sum+=((width-dot.dist)+dong_dist);
                }
            }else if(dot.direction==2){
                if(dong_direction==1){
                    int tmp1 = height;
                    int tmp2 = height;
                    tmp1 += (dong_dist+dot.dist);
                    tmp2 += (width-dong_dist)+(width-dot.dist);
                    sum+=Math.min(tmp1,tmp2);
                }else if(dong_direction==2){
                    sum+=Math.abs(dong_dist-dot.dist);
                }else if(dong_direction==3){
                    sum+=(dot.dist+(height-dong_dist));
                }else{
                    sum+=((width - dot.dist)+(height-dong_dist));
                }
            }else if(dot.direction==3){
                if(dong_direction==1){
                    sum+=(dong_dist+dot.dist);
                }else if(dong_direction==2){
                    sum+=(dong_dist)+(height-dot.dist);
                }else if(dong_direction==3){
                    sum+=Math.abs(dong_dist-dot.dist);
                }else{
                    int tmp1 = width;
                    int tmp2 = width;
                    tmp1 +=(dot.dist+dong_dist);
                    tmp2 +=(height-dot.dist)+(height-dong_dist);
                    sum+=Math.min(tmp1,tmp2);
                }
            }else{
                if(dong_direction==1){
                    sum+=dot.dist+(width-dong_dist);
                }else if(dong_direction==2){
                    sum+=(width-dong_dist)+(height-dot.dist);
                }else if(dong_direction==3){
                    int tmp1 = width;
                    int tmp2 = width;
                    tmp1 +=dong_dist+dot.dist;
                    tmp2+=(height-dong_dist)+(height-dot.dist);
                    sum+=Math.min(tmp1,tmp2);
                }else{
                    sum+=Math.abs(dong_dist-dot.dist);
                }
            }
        }
        System.out.println(sum);
    }
}
