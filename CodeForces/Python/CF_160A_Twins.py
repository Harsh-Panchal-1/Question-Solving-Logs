# Problem: 160A. Translation
# Link: https://codeforces.com/problemset/problem/160/A

n = int(input())
mySum = 0


coins = list(map(int,input().split()))

totalSum = sum(coins)

coins.sort(reverse=True)
count = 0

for i in coins:
  mySum += i
  count += 1
  if (mySum > totalSum/2):
    break
print(count)