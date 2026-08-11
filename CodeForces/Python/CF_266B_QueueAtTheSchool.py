# Problem: 266B. Queue at the School
# Link: https://codeforces.com/problemset/problem/266/B

students, time = map(int,input().split())
queue = input().upper()

for i in range(time):
  queue = queue.replace("BG", "GB")

print(queue)