# Problem: 61A. Ultra-Fast Mathematician
# Link: https://codeforces.com/problemset/problem/61/A

a = input()
b = input()

for i in range(len(a)):
    if a[i] == b[i]:
        print('0', end='')
    else:
        print('1', end='')
        
print()
