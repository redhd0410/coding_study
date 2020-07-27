import sys
from collections import deque

sys.stdin = open("input.txt", "r")
pictures = int(input())
likes = int(input())
students = list(map(int, input().split()))

liked = [0] * 21
framed = []

for student in students:
    if (len(framed) < 3):
        framed.append(student)
        liked[student] += 1
    else:
        if student in framed:
            liked[student] += 1
        else:
            min_liked = min([i for i in liked if i!= 0])
            for j in range(3):
                if liked[framed[j]] == min_liked:
                    liked[framed[j]] = 0
                    framed.remove(framed[j])
                    break
            framed.append(student)
            liked[student] += 1

ans = " ".join(str(student) for student in sorted(framed))
print(ans)