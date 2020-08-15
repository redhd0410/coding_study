import sys
from collections import deque
sys.stdin = open("input.txt")

# Connection: Edge, Computer: Vertice
V = int(input())
E = int(input())

connection = [[] for _ in range(V + 1)]
visited = [False] * (V + 1)

def bfs(connection):
    visited[1] = True
    queue = deque()
    queue.append(1)
    num_affected = 0

    while queue:
        node = queue.popleft()
        for nv in connection[node]:
            if not visited[nv]:
                queue.append(nv)
                visited[nv] = True
                num_affected += 1

    return num_affected


for _ in range(E):
    C1, C2 = map(int, input().split())
    connection[C1].append(C2)
    connection[C2].append(C1)

print(bfs(connection))