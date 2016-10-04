n = input('Enter number sequence: ')         #dates
c = len(n)

if len(n) % 2 != 0:
    l = n[-1]
    c = c - 1
else:
    l = 0
sum = int(l)
for i in range (0, c, 2):
    sum = sum + (int(n[i]) * int(n[i+1]))

print (sum)
