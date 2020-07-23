import sys
from collections import deque

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

sys.stdin = open("input.txt", "r")
row, col = map(int, input().split())
# 인풋 저장 리스트
grid = [[int(y) for y in input().split()] for _ in range(row)]
# 주변 공기 수 세는 리스트
ice = [[0 for _ in range(col)] for _ in range(row)]
# 며칠 걸리는지 저장
time = 0
ans = 0

# 빙산이 이어져있는지 체
def bfs(start, visited):
    global grid
    queue = deque()
    queue.append(start)
    while queue:
        x, y = queue.popleft()
        visited[x][y] = True
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # Bound Checking
            if 0 <= nx < row and 0 <= ny < col:
                # 주변 공기 수 세기
                if grid[nx][ny] == 0:
                    ice[x][y] += 1
                # 상하좌우로 이어져있는 빙산 Queue에 추가
                if visited[nx][ny] == False and grid[nx][ny] != 0:
                    visited[nx][ny] = True
                    queue.append((nx, ny))
    return grid

# ICE 리스트에 저장된 공기 수 빼기
def melt():
    for i in range(row):
        for j in range(col):
            grid[i][j] = max(0, grid[i][j] - ice[i][j])

while(True):
    # 방문 여부 저장 리스트
    visited = [[False for _ in range(col)] for _ in range(row)]
    ice_count = 0
    for i in range(row):
        for j in range(col):
            if visited[i][j] == False and grid[i][j] != 0:
                bfs((i, j), visited)
                # bfs 몇번 도는지 세기
                ice_count += 1
    # 조각이 두개 이상 되는 순간
    if ice_count > 1:
        ans = time
        break
    # 조각이 한개도 안남은 순간
    if ice_count == 0:
        ans = 0
        break
    melt()
    time += 1

print(ans)