import sys

sys.stdin = open("input.txt", "r")
n = int(input())

for _ in range(n):
    word = input()
    start, end = 0, len(word) - 1
    ans = True

    while start <= end:
        if word[start] == word[end]:
            continue
        else:
