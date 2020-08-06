import sys

sys.stdin = open("input.txt", "r")
A = [int(n) for n in input().split()]
B = [int(n) for n in input().split()]
A_score = 0
B_score = 0

for i in range(10):
    if A[i] > B[i]:
        A_score += 3
    elif A[i] < B[i]:
        B_score += 3
    elif A[i] == B[i]:
        A_score += 1
        B_score += 1

print(A_score, B_score)

if A_score > B_score:
    print("A")
elif A_score == B_score:
    print("D")
else:
    print("B")
