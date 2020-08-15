import sys

sys.stdin = open("input.txt", "r")
n = int(input())

colors = [[]]

sum = 0

for _ in range(n):
    pos, color = map(int, input().split())
    if color == 1 :
        colors[color].append(pos)
    else:
        colors[color].append(pos)

for i in range(2):

    sum += white[i][1] - white[i][0]

    for j in range(1, len(white))