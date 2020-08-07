import sys, math

sys.stdin = open("input.txt", "r")
N, C = map(int, input().split())
M = int(input())

data = []

for _ in range(M):
    s, e, w = map(int, input().split())
    data.append([s, e, w])

# 도착지 기준으로 오름차순 정렬
data.sort(key=lambda x: (x[1], x[0]))
rooms = [C] * N

weight = 0
for d in data:
    print(d)
    start = d[0]
    end = d[1]
    box = d[2]

    # 자리 없을 때
    if rooms[start] == 0:
        continue

    # 현재 용량이 박스보다 작은지 체크
    # 용량이 작다면 남은 공간을 박스로 지정 (남은 공간 만큼만 옮김)
    for i in range(start, end):
        if rooms[i] < box:
            print(box)
            box = rooms[i]

    # 마을 용량에서 박스 용량 빼줌
    for i in range(start, end):
        rooms[i] -= box

    weight += box

print(weight)