# Problem: 110A. Nearly Lucky Number
# Link: https://codeforces.com/problemset/problem/110/A

n = input()
count = n.count('4') + n.count('7')

if count == 4 or count == 7:
    print("YES")
else:
    print("NO")
