import sys

sys.stdin = open("2667.txt", "r")
n = int(input())
complex_map = [[int(line) for line in input()] for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

complex = [0] * 100000
complex_num = 0


def find_complex(i, j):
    complex_map[i][j] = 0
    complex[complex_num] += 1
    # 좌표에서 상하좌우 네 방향으로 탐색하기
    for coord in range(4):
        nx = i + dx[coord]
        ny = j + dy[coord]
        # 새로 계산된 좌표 bound checking
        if (0 <= nx < n and 0 <= ny < n):
            if (complex_map[nx][ny] == 1):
                find_complex(nx, ny)


for i in range(n):
    for j in range(n):
        if (complex_map[i][j] == 1):
            find_complex(i, j)
            complex_num += 1

complex = list(filter(lambda a: a != 0, complex))
sorted_complex = sorted(complex)
sorted_len = len(sorted_complex)

print(sorted_len)
for item in sorted_complex:
    print(item)
