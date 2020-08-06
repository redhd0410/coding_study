import sys

sys.stdin = open("input.txt", "r")
N = int(input())
calls = [int(n) for n in input().split()]
M = int(input())
start, end = 0, max(calls)
tot_sum = 0

if sum(calls) <= N :
    print(end)
else:
    while start <= end:
        mid = (start+end) // 2
        tmp = 0
        for idx in range(len(calls)):
            if calls[idx] >= mid:
                tmp += mid
            else:
                tmp += calls[idx]
        if tmp > M:
            end = mid - 1
        else:
            start = mid + 1
    print(mid)

