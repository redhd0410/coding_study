import sys

sys.stdin = open("input.txt", "r")

grid = [list(map(int, input().split())) for _ in range(5)]
call = []

for i in range(5):
    call.extend(list(map(int, input().split())))

