n = int(input())
tot = 0

for i in range(n + 1):
    num_str = str(i)
    if '3' in num_str or '6' in num_str or '9' in num_str:
        tot += num_str.count('3')
        tot += num_str.count('6')
        tot += num_str.count('9')

print(tot)