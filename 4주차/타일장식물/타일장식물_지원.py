import sys, math

sys.stdin = open("input.txt", "r")
n = int(input())
dp = [0] * 81
dp[0] = 1
dp[1] = 1

for i in range(2, n + 1):
    dp[i] = dp[i - 1] + dp[i - 2]

print((dp[n] * 2) + (dp[n - 1]) * 2)
