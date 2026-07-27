# Problem: 236A. Boy Or Girl
# Link: https://codeforces.com/problemset/problem/236/A

string = input()
unique = []
for i in string:
  if i not in unique:
    unique.append(i)
if len(unique)%2 == 0:
  print("CHAT WITH HER!")
else:
  print("IGNORE HIM!")