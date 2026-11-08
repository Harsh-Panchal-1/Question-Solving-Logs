# Problem: 469A. I Wanna Be the Guy
# Link: https://codeforces.com/problemset/problem/469/A

levels = int(input())
level_arr = set()
input1 = list(map(int, input().split()))

for i in input1[1:]:
  level_arr.add(i)

input2 = list(map(int, input().split()))

for i in input2[1:]:
  level_arr.add(i)

if (len(level_arr)==levels):
  print("I become the guy.")
else:
  print("Oh, my keyboard!")
  
