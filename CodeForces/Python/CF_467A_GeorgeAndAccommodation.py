# Problem: 467A. George and Accommodation
# Link: https://codeforces.com/problemset/problem/467/A

rooms = int(input())
roomsAvailable = 0

for i in range(rooms):
  people, capacity = map(int,input().split())
  if (capacity - people >=2):
    roomsAvailable = roomsAvailable + 1
print(roomsAvailable)