import sys

sys.stdin = open("input.txt", "r")
A, B, C = int(input()), int(input()), int(input())
product = A * B * C
res = [0] * 10

for i in range(10):
    res[i] += str(product).count(str(i))

for c in res:
    print(c)