import sys

sys.stdin = open("input.txt", "r")
n = int(input())
tyles = list(map(int, input().split()))
max_val = max(tyles)
med_val = max_val // 2
max_sum = 0

for vals in range(med_val + 1):
    for i in range(n):
        val1 = tyles[i]
        for j in range(i + 1, n):
            val2 = tyles[j]
            if