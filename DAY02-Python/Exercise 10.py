ones = 0
zeros = 0
seq = input("Enter binary sequence: ")
t = len(seq)
for i in range (0, t):
    n = int(seq[i])
    if n == 0:
        zeros = zeros + 1
    if n == 1:
        ones = ones + 1

if ones > zeros:
    print ("Longest run was ones with length: ", ones)
if zeros > ones:
    print ("Longest run was zeros with length: ", zeros)
if zeros == ones:
    print ("Equal longest run of ones and zeros with length: ", ones)
           
