# Problem: 546A. Soldier and Bananas
# Link: https://codeforces.com/problemset/problem/546/A

k,n,w = map(int, input().split())
amount = int(k * w*(w+1)/2)
if (amount>n):
  print(amount-n)
else:
  print(0)