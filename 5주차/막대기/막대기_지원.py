import sys

sys.stdin = open("input.txt", "r")
n = int(input())
sticks = [int(input()) for i in range(n)]
longest_stick = max(sticks)
longest_idx = sticks.index(longest_stick)

num_sticks = 1

tmp_stick = sticks[n - 1]
for i in range(n - 2, longest_idx - 1, -1):
    if sticks[i] <= tmp_stick:
        continue
    else:
        num_sticks += 1
        tmp_stick = sticks[i]

print(num_sticks)