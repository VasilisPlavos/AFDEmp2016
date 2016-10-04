s = input('Enter swift: ')
s = int(s)
p = input('Enter phrase: ')
ph = []

for i in (p):
    t = ord(i)
    t = t + s
    if t > 90:
        t = t - 90
        t = 64 + t
    print(chr(t), end="")
