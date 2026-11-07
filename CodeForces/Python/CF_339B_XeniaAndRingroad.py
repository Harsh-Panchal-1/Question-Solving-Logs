# Problem: 339B. Xenia and Ringroad
# Link: https://codeforces.com/problemset/problem/339/B

timeunits = 0
n,m = map(int, input().split())
tasks = map(int, input().split())
currhouse = 1
for i in tasks:
  if (currhouse < i):
    timeunits = timeunits + (i-currhouse)
    currhouse = i
  elif (currhouse == i):
    pass
  else:
    timeunits = timeunits + (n-currhouse) + i
    currhouse = i
print(timeunits)
