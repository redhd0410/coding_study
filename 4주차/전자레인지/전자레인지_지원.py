import sys

sys.stdin = open("input.txt", "r")
n = int(input()) # 100
times = [300, 60, 10]
clicked = [0, 0, 0]

for i in range(3):
    if times[i] > n:
        pass
    else:
        clicked[i] = n // times[i]
    n = n % times[i]

print(" ".join(str(x) for x in clicked))