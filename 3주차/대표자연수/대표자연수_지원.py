import sys
import copy

sys.stdin = open("input.txt", "r")
n = int(input())
numbers = sorted(list(map(int, input().split())))
print(numbers[len(numbers)//2 - 1] if len(numbers) % 2 == 0 else numbers[len(numbers)//2])




"""
res = float('inf')
answers = []

for i in range(n):
    tmp = copy.deepcopy(numbers)
    num = tmp.pop(i)
    total = 0
    for j in range(n - 1):
        total += abs(num - tmp[j])
    if res >= total:
        res = total
        answers.append(num)

print(sorted(answers)[0])
"""
