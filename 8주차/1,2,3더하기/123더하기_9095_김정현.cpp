#include <iostream>
#define MAX 99
using namespace std;

int main() {
	int T=0;
	int array[MAX];
	int dp[12];
	int temp;

	cin >>T;
	for (int t = 0;t < T;t++) {
		cin >> array[t];
	}

	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 4;
	for (int i = 4;i <= 11;i++) {
		dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
	}

	for (int j = 0;j < T;j++) {
		temp = array[j];
		cout << dp[temp] << endl;
	}

	return 0;
}