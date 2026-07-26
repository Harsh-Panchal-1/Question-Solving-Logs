# Problem: 339A. Helpful Maths
# Link: https://codeforces.com/problemset/problem/339/A

s = input()
numbers = s.split("+")
numbers.sort()
result = "+".join(numbers)
print(result)