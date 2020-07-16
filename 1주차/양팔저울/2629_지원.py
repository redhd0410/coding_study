import sys

sys.stdin = open("input.txt", "r")
w_n = int(sys.stdin.readline())
weights = [int(line) for line in sys.stdin.readline().split()]
b_n = int(sys.stdin.readline())
beads = [int(line) for line in sys.stdin.readline().split()]

comb = [0] * (sum(weights) + 1)
comb[0] = 1

for weight in weights:
    comb[weight] = 1

for i in range(w_n):
    for j in range(i + 1, w_n):
        plus = weights[j] + weights[i]
        minus = abs(weights[j] - weights[i])
        comb[plus] = 1
        comb[minus] = 1

ans_string = ""
for bead in beads:
    if comb[bead] == 1:
        ans_string += "Y "
    elif comb[bead] == 0:
        ans_string += "N "

print(ans_string)