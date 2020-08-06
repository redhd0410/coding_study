import sys

sys.stdin = open("input.txt", "r")
n = int(input())
left_deck = list(map(int, input().split()))
right_deck = list(map(int, input().split()))
dp = [[0 for _ in range(n + 1)] for _ in range(n + 1)]

# 맨 아랫층부터 시작
for i in range(n-1, -1, -1):
    for j in range(n-1, -1, -1):
        # 오른쪽만 버리는 경우, 왼쪽만 버리는 경우, 둘 다 버리는 경우
        if right_deck[j] < left_deck[i]:
            dp[i][j] = max(dp[i][j+1] + right_deck[j], dp[i+1][j], dp[i+1][j+1])
        # 왼쪽만 버리는 경우, 둘 다 버리는 경우
        else:
            dp[i][j] = max(dp[i+1][j], dp[i+1][j+1])

print(dp[0][0])