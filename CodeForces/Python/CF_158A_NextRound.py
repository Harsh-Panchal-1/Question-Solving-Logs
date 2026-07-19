# Problem: 158A. Next Round
# Link: https://codeforces.com/problemset/problem/158/A

n, k = map(int, input().split())

scores = list(map(int, input().split()))

nextRound = 0
k_score = scores[k - 1]
for score in scores:
    if score >= k_score and score > 0:
        nextRound += 1

print(nextRound)