# Problem: 112A. Petya and strings
# Link: https://codeforces.com/problemset/problem/112/A

string1 = input().lower()
string2 = input().lower()
if string1>string2:
  result = 1
elif string1<string2:
  result = -1
elif string1==string2:
  result = 0
print(result)