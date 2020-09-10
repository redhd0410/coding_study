#include <iostream>
using namespace std;
int MAX(int x, int y) { return x > y ? x : y; }
int MIN(int x, int y) { return x < y ? x : y; }
int main() {

	long int A, B, C, X, Y;
	long int value = 0;
	long int temp = 0;

	cin >> A >> B >> C >> X >> Y;

	temp = (5001 * 100001) + (5001 * 100001);
	for (int i = 0;i <= MIN(X, Y);i++) {
		temp = MIN(temp, (A * (X - i)) + (B * (Y - i)) + (2 * i * C));
	}
	temp = MIN(temp, (MAX(X, Y)) * (2 * C));
	cout << temp << endl;


	return 0;
}