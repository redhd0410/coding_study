import sys
from collections import deque

sys.stdin = open("input.txt", "r")
n, k = map(int, input().split())
grid = []
for i in range(n):
    grid.append(float(input()))

grid = sorted(grid)

# input: sorted
def julsa(grid, k):
    trimmed = grid[k:len(grid)-k]
    return round(sum(trimmed)/len(trimmed), 2)

def bojung(grid, k):
    num1 = grid[k]
    num2 = grid[len(grid)-k-1]
    for i in range(k):
        grid[i] = num1
    for i in range(len(grid) - k, len(grid)):
        grid[i] = num2
    return round(sum(grid)/n, 2)

print(julsa(grid, k))
print(bojung(grid, k))