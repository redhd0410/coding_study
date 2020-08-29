import sys

sys.stdin = open("input01.txt", "r")
word = input()
word2 = ''

for i in range(len(word)-1,-1,-1):
    word2 += word[i]

if(word==word2):
    print(True)
else:
    print(False)