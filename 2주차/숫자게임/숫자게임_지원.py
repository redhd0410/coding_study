import sys

sys.stdin = open("input.txt", "r")
n = int(input())
cards = [[int(line) for line in input().split()] for _ in range(n)]

total_max = 0
idx = 0

for x in range(len(cards)):
    cur_max = 0
    card = cards[x]
    for i in range(5):
        for j in range(i + 1, 5):
            for k in range(j + 1, 5):
                remainder = (card[i]+card[j]+card[k]) % 10
                cur_max = max(cur_max, remainder)
    if cur_max >= total_max:
        total_max = cur_max
        idx = x

print(idx + 1)