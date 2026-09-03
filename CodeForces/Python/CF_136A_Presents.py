# Problem: 136A. Presents
# Link: https://codeforces.com/problemset/problem/136/A

people = int(input())

arr = [0] * people

places = list(map(int, input().split()))

for i in range(1, people + 1):
  place = places[i - 1]
  arr[place - 1] = i

for val in arr:
  print(val, end=" ")
print()