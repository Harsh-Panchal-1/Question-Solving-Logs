# Problem: 231A. Team
# Link: https://codeforces.com/problemset/problem/231/A

queNum = int(input())
solvable = 0
for i in range(0,queNum):
  x,y,z = map(int,input().split())
  if [x,y,z].count(1) == 2 or [x,y,z].count(1)==3:
    solvable=solvable+1
print(solvable)