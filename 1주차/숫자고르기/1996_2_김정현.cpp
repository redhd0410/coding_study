#include <iostream>
#include <algorithm>
using namespace std;

int n;

int ans[101];
int fin[101];
int map[101];
int visited[101];
int cnt = 0 ;

void dfs(int n){
    int i;

    //방문 표시
    visited[n] = 1;
    if(visited[map[n]] == 0){
        dfs(map[n]);
    }else if(fin[map[n]== 0 ]){
        ans[cnt++] = n;
        for(i = map[n]; i!=n; i=map[i]){
            ans[cnt++] = i;
        }
    }

    fin[n] = 1;
}

int main(){


    cin >> n;

    for(int i=0;i<n;i++){
       cin >> map[i];
    }

    for(int i = 1;i<=n;i++){
        if(visited[i])continue;
            dfs(i);
    }

    sort(ans, ans+cnt);

    cout<<cnt<<"\n";
    for(int i=0;i<cnt;i++){
        cout<<ans[i]<<"\n";
    }
    return 0;
}