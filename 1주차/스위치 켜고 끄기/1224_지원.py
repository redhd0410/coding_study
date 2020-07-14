import sys

# 런타임에러뜸 ㅠㅠㅠㅠㅠㅠㅠㅠ

sys.stdin = open("input.txt", "r")
n = int(sys.stdin.readline())
switches = [switch for switch in sys.stdin.readline().split()]
num_students = int(sys.stdin.readline())

def on_off(i):
    global switches
    if switches[i] == "1" :
        switches[i] = "0"
    elif switches[i] == "0" :
        switches[i] = "1"

# n: int, switch: int, switches: list
def boy_switch(n, switch):
    global switches
    for i in range(n):
        if (i + 1) % switch == 0 :
            on_off(i)

# n: int, switch: int, switches: list
def girl_switch(n, switch):
    global switches
    switch = switch - 1
    # 일단 받은 수의 스위치의 상태를 바꾼다
    on_off(switch)
    for i in range(1, n//2):
        lower = switch - i
        upper = switch + i
        if 0 <= lower and upper < n:
            if switches[lower] == switches[upper]:
                on_off(lower)
                on_off(upper)

for line in sys.stdin.readlines():
    gender, switch = line.split()
    if gender == "1" :
        boy_switch(n, int(switch))
    elif gender == "2" :
        girl_switch(n, int(switch))

for i in switches:
    print(i, end = " ")