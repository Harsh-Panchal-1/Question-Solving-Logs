# Problem: 66B. Petya and Countryside.
# Link: https://codeforces.com/problemset/problem/66/B

n = int(input())

numbers = list(map(int, input().split()))

max_watered = 0

for i in range(len(numbers)):
  current_water=1
  for j in range(i,len(numbers)-1):
    if(numbers[j]>=numbers[j+1]):
      current_water+=1
    else:
      break
  for j in range(i,0,-1):
    if(numbers[j]>=numbers[j-1]):
      current_water+=1
    else:
      break
  if(current_water>max_watered):
    max_watered=current_water
print(max_watered)