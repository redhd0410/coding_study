import sys
sys.stdin = open("input.txt")

heights = sorted([int(input()) for i in range(9)])
heights_sum = sum(heights)

for i in range(9):
    for j in range(i + 1, 9):
        tmp1 = heights[i]
        tmp2 = heights[j]
        if heights_sum - tmp1 - tmp2 == 100:
            heights.remove(tmp1)
            heights.remove(tmp2)
            for height in heights:
                print(height)
            exit()
