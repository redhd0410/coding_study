import sys

sys.stdin = open("input.txt", "r")
n = int(input())
sum = 0

for i in range(n):
    students, apples = map(int, input().split())
    sum += apples % students

print(sum)
