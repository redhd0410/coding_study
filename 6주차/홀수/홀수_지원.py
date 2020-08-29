import sys

sys.stdin = open("input.txt", "r")
N = [int(input()) for _ in range(7)]

def check_odd(num):
    if num % 2 != 0:
        return True
    return False

res = []

for num in N:
    if check_odd(num) == True:
        res.append(num)

print(sum(res) if sum(res) > 0 else -1)
print(min(res))