import sys
sys.stdin = open("input.txt")

num1 = int(input())
num2 = input()
num2_break = [int(x) for x in num2]

for i in reversed(range(len(num2_break))):
    print(num1 * num2_break[i])

print(num1 * int(num2))