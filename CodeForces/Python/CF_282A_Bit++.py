# Problem: 282A. Bit++
# Link: https://codeforces.com/problemset/problem/282/A

count = int(input())
result = 0
for i in range(count):
  statement = input()
  if (statement[1]=='-'):
    result -=1
  elif (statement[1]=='+'):
    result +=1
print(result)