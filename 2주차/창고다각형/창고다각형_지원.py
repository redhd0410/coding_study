import sys

sys.stdin = open("input.txt", "r")
n = int(input())
grid = [0] * 1001
max_x = 0
max_y = 0
end = 0
res = 0

for i in range(n):
    x, y = map(int, input().split())
    grid[x] = y
    end = max(end, x)
    if max_y < y :
        max_x = x
        max_y = y

# max 왼쪽
cur_max = 0
for i in range(max_x):
    cur_max = max(cur_max, grid[i])
    res += cur_max

# max 오른쪽
cur_max = 0
for i in range(end, max_x - 1, -1):
    cur_max = max(cur_max, grid[i])
    res += cur_max

print(res)


