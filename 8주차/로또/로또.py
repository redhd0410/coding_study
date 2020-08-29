import sys

sys.stdin = open("input04.txt", "r")

def lotto(x, cnt):
    if cnt == 6:
        for i in range(k):
            if select[i]:
                print(a[i], end=' ')
        print()
        return

    for i in range(x, k):
        select[i] = 1
        lotto(i+1, cnt+1)
        select[i] = 0

while True:
    a = list((map(int, input().split())))
    k = a[0]
    if k == 0:
        break
    a = a[1:]
    select = [0 for _ in range(k)]
    lotto(0, 0)
    print()