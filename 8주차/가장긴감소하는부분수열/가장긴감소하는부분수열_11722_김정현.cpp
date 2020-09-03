/*

#include <iostream>
using namespace std;
#define MAX 1001


int main() {

	int N;
	int array[MAX] = { 0 };
	int dp[MAX] = { 0 };

	cin >> N;
	for (int i = 1;i <= N;i++) {
		cin >> array[i];
	}
	for (int i = 1;i <= N;i++) {
		dp[i] = 1;
		for (int j = 1;j <= i;j++) {
			if (array[i] < array[j] && dp[j] + 1 > dp[i])
			{
				dp[i] = dp[j] + 1;
			}
		}
	}
	int temp = 0;
	for (int i = 1;i <= N;i++) {
		if (dp[i] > temp) {
			temp = dp[i];
		}
	}
	cout << temp << endl;

	return 0;
}

*/