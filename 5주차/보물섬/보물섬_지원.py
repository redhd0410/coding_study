import sys
from collections import deque
sys.stdin = open("input.txt")

H, W = map(int, input().split())
treasure = [[0 if c == "W" else 1 for c in input()] for _ in range(H)]

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(i, j):
    tmp = treasure
    queue = deque()
    queue.append((i, j, 0))
    visited = [[False] * W for _ in range(H)]
    visited[i][j] = True
    num = 0

    while queue:
        x, y, d = queue.popleft()
        for coord in range(4):
            nx = x + dx[coord]
            ny = y + dy[coord]
            # Bound Checking
            if nx < 0 or nx >= H or ny < 0 or ny >= W:
                continue
            if not visited[nx][ny] and tmp[nx][ny] == 1:
                queue.append((nx, ny, d + 1))
                visited[nx][ny] = True
                num = max(num, d+1)

    return num

ans = 0
for i in range(H):
    for j in range(W):
        if treasure[i][j] == 1:
            ans = max(ans, bfs(i, j))

print(ans)