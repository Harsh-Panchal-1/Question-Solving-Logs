# Problem: 131A. cAPS lOCK
# Link: https://codeforces.com/problemset/problem/131/A

word = input()

change_case = True
for i in range(1, len(word)):
    if word[i].islower():
        change_case = False
        break

if change_case:
    new_word = ""
    for c in word:
        if c.isupper():
            new_word += c.lower()
        else:
            new_word += c.upper()
    print(new_word)
else:
    print(word)
