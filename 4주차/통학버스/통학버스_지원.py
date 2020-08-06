import sys

sys.stdin = open("input.txt", "r")
N, K, S = map(int, input().split())
complex = [0] * 100001
distance = 0

for _ in range(N):
    coord, num = map(int, input().split())
    complex[coord] = num

