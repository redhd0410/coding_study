import sys

sys.stdin = open("input.txt", "r")
length, width = map(int, sys.stdin.readline().split())
n = sys.stdin.readline()

# 끝의 좌표를 넣어줌
x_cut = [0, width]
y_cut = [0, length]

# 어디서 자르는지 좌표를 가로, 세로 리스트에 추가
for line in sys.stdin.readlines():
    direction, pos = map(int, line.split())
    if (direction == 0):
        x_cut.append(pos)
    else:
        y_cut.append(pos)

# 정렬
x_cut.sort()
y_cut.sort()

# 면적 저장할 필드
dimension = 0
for i in range(1, len(x_cut)):
    x = x_cut[i] - x_cut[i - 1]
    for j in range(1, len(y_cut)):
        y = y_cut[j] - y_cut[j - 1]
        dim = x * y
        if dimension < dim:
            dimension = dim

print(dimension)