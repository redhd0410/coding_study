import sys

sys.stdin = open("input.txt", "r")
n = int(input())
tiles = list(map(int, input().split()))
value = [-1] * 1000001
dp = [[-1 for i in range(n)] for j in range(n)]

result = 0

for tile1 in range(n - 1, -1, -1):
    num = tiles[tile1]
    value[num] = tile1
    for tile2 in range(tile1+1, n):
        # 세번째 항: 2 * 두번째 수 - 첫번째 수
        tile3 = 2 * tiles[tile2] - num
        # 수 업데이트
        if tile3 > 1000000 or value[tile3] == -1:
            dp[tile1][tile2] = num + tiles[tile2]
        # -1이 아닌 경우에
        else:
            dp[tile1][tile2] = num + dp[tile2][value[tile3]]
            if result < dp[tile1][tile2]:
                result = dp[tile1][tile2]

print(result)
