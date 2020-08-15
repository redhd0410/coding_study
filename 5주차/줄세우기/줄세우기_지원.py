import sys
sys.stdin = open("input.txt")

n = int(input())
tickets = list(map(int, input().split()))
queue = []

for i in range(n):
    ticket = tickets[i]
    idx = i - ticket
    queue.insert(idx, i)

print(" ".join([str(x + 1) for x in queue]))