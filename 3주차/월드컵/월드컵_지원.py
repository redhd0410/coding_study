import sys
from collections import deque

sys.stdin = open("input.txt", "r")
grid = [[int(n) for n in input().split()] for _ in range(4)]
print(grid)