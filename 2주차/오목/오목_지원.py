import sys
from collections import deque

sys.stdin = open("input.txt", "r")
grid = [[int(line) for line in input().split()] for _ in range(19)]

def checkFive(direction, i, j, player):
    if direction == "RIGHT-UP":
        if i >= 4 and j + 4 < 19:
            for x in range(1, 5):
                if grid[i - x][j + x] != player:
                    return False
        else:
            return False
    elif direction == "RIGHT":
        if j + 4 < 19:
            for x in range(1, 5):
                if grid[i][j + x] != player:
                    return False
        else:
            return False
    elif direction == "RIGHT-DOWN":
        if i + 4 < 19 and j + 4 < 19:
            for x in range(1, 5):
                if grid[i + x][j + x] != player:
                    return False
        else:
            return False
    elif direction == "DOWN":
        if i + 4 < 19:
            for x in range(1, 5):
                if grid[i + x][j] != player:
                    return False
        else:
            return False
    return True

for player in range(1, 3):
    for i in range(19):
        for j in range(19):
            if grid[i][j] == player:
                if checkFive("RIGHT-UP", i, j, player) or checkFive("RIGHT", i, j, player)\
                        or checkFive("RIGHT-DOWN", i, j, player) or checkFive("DOWN", i, j, player):
                    print(player)
                    print(i + 1, j + 1)
                    break

