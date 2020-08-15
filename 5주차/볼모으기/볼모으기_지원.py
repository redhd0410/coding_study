import sys

sys.stdin = open("input.txt")

n = int(input())
ball = [s for s in input()]

def popper(color, ball):
    for _ in range(len(ball)):
        c = ball.pop()
        if c != color:
            ball.append(c)
            break
    return ball



