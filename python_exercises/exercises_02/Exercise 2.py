c, c1, c2, c3 = 0, 0, 0, 0

bits = input("Enter binary number:")
c3 = int(bits[7])
for i in range (7):
    c = int(bits[i])
    if c == 1:
        c1 = c1 + 1
    c2 = int(c1)

if c2 % 2 == 0 and c3 == 0:
    print ("Parity check OK.")
elif c2 % 2 != 0 and c3 == 1:
    print ("Parity check OK.")
else:
    print ("Parity check not OK.")
