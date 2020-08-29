import sys

sys.stdin = open("input.txt", "r")
n = int(input())
steps = [int(input()) for _ in range(n)]
dp = [0] * n

dp[0] = 0
dp[1] = steps[1]