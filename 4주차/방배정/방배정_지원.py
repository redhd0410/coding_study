import sys, math

sys.stdin = open("input.txt", "r")
N, K = map(int, input().split())
males = [0] * 7
females = [0] * 7
sum = 0

for _ in range(N):
    gender, grade = map(int, input().split())
    if gender == 0:
        females[grade] += 1
    else:
        males[grade] += 1

for students in females[1:]:
    sum += math.ceil(students/K)

for students in males[1:]:
    sum += math.ceil(students/K)

print(sum)