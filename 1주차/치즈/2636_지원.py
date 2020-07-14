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
def dfs():
    queue = deque((0,0))
    visited = [[False for _ in range(col)] for _ in range(row)]
    visited[0][0] = True

    while queue:
        for i in range(4):
            x, y = queue.popleft()
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < col and 0 <= ny < row :
                continue
            elif visited[nx][ny] == True :
                continue
            elif

for x in range(col):
    for y in range(row):
        if map[x][y] == 1:
            dfs(x, y)

for line in map:
    print(line)