# Problem: 144A. Arrival of the General
# Link: https://codeforces.com/problemset/problem/144/A

n = int(input())
heights = list(map(int, input().split()))

max_val = 0
min_val = 101
max_index = 0
min_index = 0

for i in range(n):
    if heights[i] > max_val:
        max_val = heights[i]
        max_index = i
        
    if heights[i] <= min_val:
        min_val = heights[i]
        min_index = i

if max_index > min_index:
    print(max_index + (n - 1 - min_index) - 1)
else:
    print(max_index + (n - 1 - min_index))
