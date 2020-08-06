# 문제가 뭔소린지 이해가 안됨

import sys

sys.stdin = open("input.txt", "r")
M, N = map(int, input().split())
bees = [[1 for _ in range(M)] for _ in range(M)]
growth = [list(map(int, input().split())) for _ in range(N)]


for day in range(N):
    bees_growth = [[0 for _ in range(M)] for _ in range(M)]

    idx = 0

    for i in range(M - 1, -1, -1):
        bees_growth[i][0] = growth[day][idx]
        idx += 1

    for i in range(1, M):
        bees_growth[0][i] = growth[day][idx]
        idx += 1

    for i in range(1, M):
        for j in range(1, M):
            bees_growth[i][j] = max(bees_growth[i - 1][j], bees_growth[i][j - 1], bees_growth[i - 1][j - 1])

    for i in range(M):
        for j in range(M):
            bees[i][j] += bees_growth[i][j]

print(bees)
