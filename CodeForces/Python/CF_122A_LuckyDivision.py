# Problem: 122A. Lucky Division
# Link: https://codeforces.com/problemset/problem/122/A

n = int(input())
lucky_numbers = [4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777]

if any(n % lucky == 0 for lucky in lucky_numbers):
    print("YES")
else:
    print("NO")
