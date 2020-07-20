#include<stdio.h>

int map[101][101];
int main(){
    int ans = 0;
    for(int t = 0; t<=4; t++){
        int a,b,c,d;
        scanf("%d %d %d %d",&a,&b,&c,&d);
        for(int i =a; i< c; i++){
            for(int j=b;j<d;j++){
                if(map[i][j] == 0){
                    ans ++;
                    map[i][j]=1;
                }
            }
        }
    }
    printf("%d\n",ans);
    return 0;
}