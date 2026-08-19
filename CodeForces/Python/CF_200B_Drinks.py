# Problem: 200B. Drinks
# Link: https://codeforces.com/problemset/problem/200/B

n = int(input())

percentages = list(map(int, input().split()))

print(sum(percentages) / n)
