# 투포인터

import sys

sys.stdin = open("input.txt", "r")
n, k = map(int, input().split())
numbers = list(map(int, input().split()))
max_num, i = 0, 0

part_sum = sum(numbers[:k])
max_sum = sum(numbers[:k])

while 1:
    if i + k >= n:
        break
    part_sum -= numbers[i]
    part_sum += numbers[i+k]
    max_sum = max(max_sum, part_sum)
    i += 1

print(max_sum)