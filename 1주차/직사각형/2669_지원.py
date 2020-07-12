import sys

sys.stdin = open("2669.txt", "r")
grid = [[0 for i in range(101)] for j in range(101)] # 2D Array
cnt = 0

for _ in range(4):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

    for i in range(x1, x2):
        for j in range(y1, y2):
            if ( grid[i][j] == 0 ):
                grid[i][j] = 1
                cnt += 1

print(cnt)