import sys

sys.stdin = open("input03.txt", "r")
T = int(input())

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def find_worm_count(X, Y):
    grid[X][Y] = 0
    for i in range(4):
        nx = X + dx[i]
        ny = Y + dy[i]
        if nx < 0 or nx >= M or ny < 0 or ny >= N:
            continue
        if grid[nx][ny] == 1:
            find_worm_count(nx, ny)

for _ in range(T):
    M, N, K = map(int, input().split())
    grid = [[0]*N for _ in range(M)]
    worm_count = 0
    
    for _ in range(K):   
        X, Y = map(int, input().split())
        grid[X][Y] = 1
        
    for i in range(M):
        for j in range(N):
            if grid[i][j] > 0:
                find_worm_count(i, j)
                worm_count += 1

    print(worm_count)