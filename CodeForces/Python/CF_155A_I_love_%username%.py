# Problem: 155A. I_love_%username%
# Link: https://codeforces.com/problemset/problem/155/A

n = int(input())
scores = list(map(int, input().split()))

min_score = scores[0]
max_score = scores[0]
amazing = 0

for i in range(1, n):
    if scores[i] > max_score:
        max_score = scores[i]
        amazing += 1
    elif scores[i] < min_score:
        min_score = scores[i]
        amazing += 1

print(amazing)
