import sys
from collections import deque

sys.stdin = open("input.txt", "r")
n = int(input())
candidates = [list(map(int,input().split())) for _ in range(n)]
friends = [set() for _ in range(n)]

for year in range(n):
    for person1 in range(n):
        candidate1 = candidates[person1][year]
        for person2 in range(person1 + 1, n):
            candidate2 = candidates[person2][year]
            if candidate1 == candidate2:
                friends[person1].add(person2)
                friends[person2].add(person1)

max_friends = 0
for i in range(n):
    n_friends = len(friends[i])
    if max_friends < n_friends:
        max_friends = i

print(max_friends + 1)