import sys

sys.stdin = open("input.txt", "r")
n = int(input())
n_vip = int(input())
vips = [0, n + 1]
for _ in range(n_vip):
    vips.append(int(input()))
vips.sort()
seats = []

def fib(n):
    if n == 1 or n == 2:
        return n
    return fib(n - 1) + fib(n - 2)

ans = 1
for i in range(len(vips) - 1):
    a = vips[i + 1] - vips[i] - 1
    ans *= fib(a)

print(ans)