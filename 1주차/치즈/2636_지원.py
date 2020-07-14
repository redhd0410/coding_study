import sys
from collections import deque

sys.stdin = open("input.txt", "r")
col, row = map(int, sys.stdin.readline().split())

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

time = 0

# 인풋 정보를 2D Array에 저장
map = [[int(line) for line in sys.stdin.readline().split()] for _ in range(col)]

# input: 1의 좌표
def bfs():
    queue = deque()
    queue.append((0, 0))
    # 이미 방문한 칸인지 체크하기 위한 2D Array - 처음은 False
    visited = [[False for _ in range(row)] for _ in range(col)]
    # 0,0에서 시작하니 True - 외부 공기와 연결된 모든 공기를 탐색함으로써 겉을 녹일 수 있음 
    visited[0][0] = True

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # Bound Checking
            if nx < 0 or nx >= col or ny < 0 or ny >= row:
                continue
            # 방문하지 않은 칸일 때
            if not visited[nx][ny]:
                # 치즈인 칸
                if map[nx][ny] >= 1 :
                    map[nx][ny] += 1
                else:
                    queue.append((nx, ny))
                    visited[nx][ny] = True

def melt():
    global piece
    melted, cnt = False, 0
    for i in range(col):
        for j in range(row):
            # 인접한 공기가 2 이상이면 녹임
            if map[i][j] >= 2:
                map[i][j] = 0
                melted = True
                cnt += 1
    if cnt != 0:
        piece = cnt
    return melted

while True:
    bfs()
    if melt():
        time += 1
    else:
        break
print(time)
print(piece)