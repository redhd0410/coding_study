import sys, copy
sys.stdin = open("input.txt", "r")
n = int(input())
dice = []
for _ in range(n):
    dice.append(list(map(int, input().split())))

route = {0: 5, 1: 3, 2: 4, 3: 1, 4: 2, 5: 0}
max_num = 0

for i in range(6):
    result = []
    tmp = [1, 2, 3, 4, 5, 6]
    tmp.remove(dice[0][i])
    next = dice[0][route[i]]
    tmp.remove(next)
    result.append(max(tmp))
    for j in range(1, n):
        tmp = [1, 2, 3, 4, 5, 6]
        tmp.remove(next)
        next = dice[j][route[dice[j].index(next)]]
        tmp.remove(next)
        result.append(max(tmp))
    result = sum(result)
    max_num = max(result, max_num)
    
print(max_num)