import sys

def dfs(v, i):
    visited[v] = True
    for w in adj[v]:
        # 이미 방문하지 않은 노드인 경우 dfs
        if not (visited[w]):
            dfs(w, i)
        # 이미 방문한 노드이고 인덱스와 인덱스에 대응하는 수가 같을 때는 사이클이 형성된다
        elif visited[w] and w == i:
            result.append(w)

sys.stdin = open("2668.txt", "r")
n = int(sys.stdin.readline())
adj = [[] for i in range(n + 1)]

# 두번째 리스트 구축
for i in range(n):
    adj[i+1].append(int(sys.stdin.readline()))
print(adj)

result = []
for i in range(1, n + 1):
    # 방문한 노드의 리스트를 False로 채움
    visited = [False] * (n + 1)
    dfs(i, i)

l = len(result)
print(l)
for i in range(l):
    print(result[i])