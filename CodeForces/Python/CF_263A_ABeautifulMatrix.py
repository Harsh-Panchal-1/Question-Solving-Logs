# Problem: 263A. Beautiful Matrix
# Link: https://codeforces.com/problemset/problem/263/A

for i in range(5):
    row = input().split()
    if '1' in row:
        a = i
        b = row.index('1')

print(abs(a - 2) + abs(b - 2))
