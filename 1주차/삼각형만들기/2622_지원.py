import sys

sys.stdin = open("input.txt", "r")
n = int(sys.stdin.readline())
"""
9: [4, 4, 1], [4, 3, 2], [3, 3, 3]
"""

def triangle(n):
    cnt = 0
    if n == 1 or n == 2 or n == 4:
        pass
    else:
        for i in range(1, n):
            for j in range(i, n):
                largest = n - (i + j)
                if largest < j:
                    break
                elif largest < i + j:
                    cnt += 1
    return cnt

print(triangle(n))
