#include <iostream>
using namespace std;

int N, M;
int chicken[14];
int cnt, value = 0;
int dx[] = { 0,0,-1,1 };
int dy[] = { -1,1,0,0 };
void dfs(int x, int y, int n);
int array[51][51];

int main(){
	
	cin >> N >> M;
	for (int i = 0;i < N;i++) {
		for (int j = 0;j < N;j++) {
			cin >> array[i][j];
		}
	}

	for (int i = 0;i < N;i++) {
		for (int j = 0;j < N;j++) {
			if (array[i][j] == (0 || 1)) continue;

		}
	}


	cout << value << endl;


	return 0;
}

void dfs(int x, int y, int n) {
	for (int i = 0;i < 4;i++) {
		int nx = x + dx[i];
		int ny = x + dy[i];

		if (array[nx][ny])


			if (nx < n && ny < n) {
				dfs(nx, ny, n);
			}
	}
}