import sys

sys.stdin = open("input.txt", "r")

N, M = map(int, input().split())
dp = [0] * N + 1

