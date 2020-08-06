import sys, copy

sys.stdin = open("input.txt", "r")
n = int(input())
grid = [[int(n) for n in input().split()] for _ in range(5)]
max_num = max(list(map(max, grid)))
max_blocks = 0

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(grid, smallest, row, col):
    grid[row][col] = 0
    for coord in range(4):
        nx = row + dx[coord]
        ny = col + dy[coord]
        if (0 <= nx < n and 0 <= ny < n):
            if grid[nx][ny] > 0:
                bfs(grid, smallest, nx, ny)

for i in range(1, max_num):
    tmp = copy.deepcopy(grid)
    num_blocks = 0

    for line in tmp:
        for l in range(n):
            if line[l] <= i:
                line[l] = 0

    for row in range(n):
        for col in range(n):
            if tmp[row][col] > 0:
                bfs(tmp, i, row, col)
                num_blocks += 1

    max_blocks = max(max_blocks, num_blocks)

    print(max_blocks)