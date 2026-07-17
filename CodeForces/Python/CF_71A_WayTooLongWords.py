# Problem: 71A. Way Too Long Words
# Link: https://codeforces.com/problemset/problem/71/A

wordCount = int(input())
words = []
for i in range(wordCount):
  word = input()
  words.append(word)
for string in words:
  length = len(string)
  if length>10:
    print(f"{string[0]}{(length-2)}{string[-1]}")
  else:
    print(string)