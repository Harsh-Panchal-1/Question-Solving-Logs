# Problem: 80A. Panoramix's Prediction
# Link: https://codeforces.com/problemset/problem/80/A

n1, n2 = map(int, input().split())

def isPrime(n):
  for i in range(2, n):
    if (n % i == 0):
      return False
  return True

nextPrime = n1 + 1
while not isPrime(nextPrime):
  nextPrime = nextPrime + 1

if nextPrime == n2:
  print("YES")
else:
  print("NO")
