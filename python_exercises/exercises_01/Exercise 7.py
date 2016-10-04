i = int(input("Enter the number of pronic numbers to output:"))
pr, a = 0, 0

while pr < i:
    a = a + 1
    b = a + 1
    print ((a * b), end=" ")
    pr = pr + 1
