import sys

sys.stdin = open("input.txt", "r")
n = int(input())
scores = list(map(int, input().split()))
scores.sort()

print(scores[n-1] - scores[0])