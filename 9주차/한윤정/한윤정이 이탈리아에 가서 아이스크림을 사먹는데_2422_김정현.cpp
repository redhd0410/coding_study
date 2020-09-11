
#include<iostream>
using namespace std;
int main() {

	int M, N;
	int x, y;
	int value = 0;
	bool array[201][201];
	cin >> N >> M;
	for (int i = 0;i < 201;i++) {
		for (int j = 0;j < 201;j++) {
			array[i][j] = true;
		}
	}
	for (int i = 0;i < M;i++) {
		cin >> x >> y;
		array[x][y] = false;
		array[y][x] = false;
	}
	for (int i = 1;i <= N - 2;i++) {
		for (int j = i + 1;j <= N - 1;j++) {
			if (array[i][j] == false) continue;

			for (int k = j + 1;k <= N;k++) {
				if (array[j][k] == false || array[i][k] == false) continue;
				value++;
			}

		}
	}

	cout << value << endl;
	return 0;
}

