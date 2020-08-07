import sys

sys.stdin = open("input.txt", "r")

N, M = map(int, input().split())
unavail = list(map(int, input().split()))

def solve(N, unavail):
    dp = [[float('inf') for _ in range(200)] for i in range(101)]
    dp[0][0] = 0  # [i][j]: i일 놀고 j개의 쿠폰을 가지고 있음
    for i in range(N):
        for j in range(50):
            if dp[i][j] == float('inf'):
                continue
            if i + 1 in unavail:
                dp[i + 1][j] = min(dp[i + 1][j], dp[i][j])
                continue
            # 하루 이용
            dp[i + 1][j] = min(dp[i][j] + 10000, dp[i + 1][j])
            # 3일권 이용
            for k in range(1, 4):
                if i + k > N:
                    break
                dp[i + k][j + 1] = min(dp[i][j] + 25000, dp[i + k][j + 1])
            # 5일권 이용
            for k in range(1, 6):
                if i + k > N:
                    break
                dp[i + k][j + 2] = min(dp[i][j] + 37000, dp[i + k][j + 2])
            # 쿠폰 있을 경우
            if j >= 3:
                dp[i + 1][j - 3] = min(dp[i][j], dp[i + 1][j - 3])

    ans = float('inf')
    for i in range(len(dp[N])):
        ans = min(dp[N][i], ans)
    return ans

if M == 0:
    print(solve(N, []))

else:
    print(solve(N, unavail))
