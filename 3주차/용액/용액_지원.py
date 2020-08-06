# 투포인터 알고리즘

import sys
sys.stdin = open("input.txt", "r")

n = int(input())
numbers = list(map(int, input().split()))

checked = [0] * 1000001
start, end, = 0, n - 1

density = float('inf')

while start < end:
    tmp = numbers[start] + numbers[end]
    abs_tmp = abs(tmp)
    if abs_tmp < density:
        density = abs_tmp
        first = numbers[start]
        second = numbers[end]
    if tmp < 0:
        start += 1
    else:
        end -= 1

print(first, second)