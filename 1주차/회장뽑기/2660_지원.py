# DFS/BFS로 어떻게 풀지?

import sys

sys.stdin = open("input.txt", "r")
n = int(sys.stdin.readline())
pool = [[float('inf') for i in range(n + 1)] for j in range(n + 1)]
lines = sys.stdin.readlines()

# 인접 행렬로 인풋 표현
for line in lines:
    a, b = map(int, line.split())
    if (a != -1 and b != - 1):
        pool[a][b] = 1
        pool[b][a] = 1

# 플로이드 워셜 알고리즘

for i in range(1, n + 1):
    pool[i][i] = 0

for middle in range(1, n + 1):  # 가운데 노드
    for start in range(1, n + 1):  # 시작 노드
        for end in range(1, n + 1):  # 마지막 노드
            if pool[start][end] > pool[start][middle] + pool[middle][end]:
                pool[start][end] = pool[start][middle] + pool[middle][end]

people_scores = [max(score[1:]) for score in pool[1:]]
candidate_pool = list()

# Output
score = min(people_scores)
num_candidates = people_scores.count(score)

print(score, num_candidates)

for one in range(n):
    if people_scores[one] == score :
        candidate_pool.append(one + 1)

for i in candidate_pool:
    print(i, end = " ")
