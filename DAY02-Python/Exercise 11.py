c = 0
n = int (input("Enter limit:"))
for i in range(1, n+1):
    x = i
    while (x % 2) == 0:
        x /= 2
    if x != 1:
        print ((i), end=" ")
        c = c + 1
        if c == 10:
            print ("")
            c = 0
