# Problem: 118A. String Task
# Link: https://codeforces.com/problemset/problem/118/A

string = input().lower()
vowels = ['a','e','i','o','u','y']

for i in vowels:
  if (i in vowels):
    string = string.replace(i,"")

string = ".".join(string)
print(f".{string}")