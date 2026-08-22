# Problem: 734A. Anton and Danik
# Link: https://codeforces.com/problemset/problem/734/A

n = input()
games = input()

anton_score = games.count('A')
danik_score = games.count('D')

if anton_score > danik_score:
    print("Anton")
elif danik_score > anton_score:
    print("Danik")
else:
    print("Friendship")
