import sys, math

sys.stdin = open("input.txt", "r")
N, C = map(int, input().split())
M = int(input())
village = [[0 for _ in range(N + 1)] for _ in range(N + 1)]
dp = [[0 for _ in range(N + 1)] for _ in range(N + 1)]

for _ in range(M):
    sender, receiver, box = map(int, input().split())
    village[sender][receiver] = box

# 0 인덱스 빼기
village = [line[1:] for line in village]

