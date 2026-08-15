# Problem: 59A. Helpful Maths
# Link: https://codeforces.com/problemset/problem/59/A

word = input()
upper = 0
for i in word:
  if (i >= 'A' and i <= 'Z'):
    upper += 1

if (upper>len(word)/2):
  print(word.upper())
else:
  print(word.lower())