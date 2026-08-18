# Problem: 200B. Drinks
# Link: https://codeforces.com/problemset/problem/200/B

# 1. Read the number of drinks
n = int(input())

# 2. Read the percentages into a list of integers
percentages = list(map(int, input().split()))

# 3. Python has a built-in sum() function! We can just sum the list and divide by n
print(sum(percentages) / n)
