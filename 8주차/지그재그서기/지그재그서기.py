import sys

sys.stdin = open("input02.txt", "r")
n = int(input())

def solve(n):
    if n == 0 or n == 1:
        return n
    