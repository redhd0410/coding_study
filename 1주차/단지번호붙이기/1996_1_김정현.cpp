#include<iostream>
#include<vector>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<algorithm>

using namespace std;

#define MAX 25

int N;
int arr[MAX][MAX];
bool visit[MAX][MAX];
int house_cnt;
int dx[4] = { 1, -1, 0, 0 };
int dy[4] = { 0, 0, 1, -1 };

vector <int> vec;

void DFS(int x, int y) {
	
	//해당 단지의 집의 수를 증가
	house_cnt++;
	// 해당 집 방문 표시
	visit[x][y] = true;
	// 해당 집 주변을 확인
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		//지도에서 벗어나지 않게
		if (nx < 0 || nx >= N || ny < 0 || ny >= N){
			// 집이면서 방문하지않은 집일때 재귀함수로 방문
			if (arr[nx][ny] == 1 && visit[nx][ny] == false){
				DFS(nx, ny);
			}
		}
	}
}

int main() {

	cin >> N;

	for (int i = 0; i < N; i++) {
		string temp;
		cin >> temp;
		for (int j = 0; j < N; j++){	
			arr[i][j] = temp[j] - '0';
		}
	}

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			//집이면서 방문하지 않았으면 방문 후 단지 갯수 추가
			if (arr[i][j] == 1 && visit[i][j] == false) {
				house_cnt = 0;
				DFS(i, j);
				vec.push_back(house_cnt);
			}
		}
	}

	//정렬
	sort(vec.begin(), vec.end());
	cout << vec.size() << endl;
	//출력
	for (int i = 0; i < vec.size(); i++) cout << vec[i] << endl;

	return 0;
}