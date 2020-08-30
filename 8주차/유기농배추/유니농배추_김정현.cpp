#include <iostream>

using namespace std;
#define MAX 51
int map[MAX][MAX];
bool visit[MAX][MAX];
int dx[] = {0,0,-1,1};
int dy[] = {-1,1,0,0};
int map_x, map_y;
int x,y;
int count;
int result;

int testcase;

void init(){
    result = 0;
    for(int i=0;i<map_x;i++){
        for(int j=0;j<map_y;j++){
            visit[i][j] = false;
             map[i][j] = 0;
        }
    }
}

void dfs(int x, int y){
    visit[x][y] = true;
    for(int i = 0;i<4;i++){
        int nx = x + dx[i];
        int ny = y + dy[i];
        if( nx >=0 && nx < map_x && ny>=0 && ny< map_y){
            if(map[nx][ny]== 1 && !visit[nx][ny]){
                dfs(nx,ny);
            }
        }
    }
}


int main(){
    cin >> testcase;
    for(int t=0;t<testcase;t++){
        
        init();
        cin >> map_x >> map_y >> count;
        for(int i=0;i<count;i++){
            cin >> x >> y;
            if(x>=0 && x < map_x && y >=0 && y < map_y){
                map[x][y] = 1;
            }
        }
        for(int i=0;i<map_x;i++){
            for(int j=0;j<map_y;j++){
                if(map[i][j] == 1 && !visit[i][j])
                {
                    dfs(i,j);
                    result++;
                }
            }
        }
        cout << result << endl;
    }
    return 0;
}
