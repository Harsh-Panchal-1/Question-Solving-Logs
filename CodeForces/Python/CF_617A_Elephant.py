# Problem: 617A. Elephant
# Link: https://codeforces.com/problemset/problem/617/A


friend = int(input())
counter = 0

for i in range(5,0,-1):
  if (i<=friend):
    counter = counter + (friend//i)
    friend = friend%i
  
print(counter)
