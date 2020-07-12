import sys

sys.stdin = open("2659.txt", "r")
digits = ''.join(word for word in sys.stdin.readline().split())
rank = 1


def min_comb(word):
    min = int(word)
    for i in range(4):
        rotated = int(word[i:] + word[:i])
        if (rotated < min):
            min = rotated
    return min


for i in range(1111, min_comb(digits)):
    clock_i = min_comb(str(i))
    if ( i != clock_i or '0' in str(i) ):
        continue
    else:
        rank += 1

print(rank)