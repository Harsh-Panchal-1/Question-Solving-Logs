# Problem: 266A. Stones On the Table
# Link: https://codeforces.com/problemset/problem/266/A

stones = int(input())
stoneString = input()
count =0
for i in range(stones-1):
  if (stoneString[i] == stoneString[i+1]):
    count = count +1

print(count)
