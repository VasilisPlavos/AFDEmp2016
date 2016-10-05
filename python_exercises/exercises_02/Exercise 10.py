ones = 0
zeros = 0
lr0 = 0
lr1 = 0
cr0 = 0
cr1 = 0
seq = input("Enter binary sequence: ")
t = len(seq)
for i in range (0, t):
    n = int(seq[i])
    if n == 1:
        if cr0 > lr0:
            lr0 = cr0
        cr0 = 0
        cr1 = cr1 + 1
    elif n == 0:
        if cr1 > lr1:
            lr1 = cr1
        cr1 = 0
        cr0 = cr0 + 1
    else:
        if cr1 > lr1:
            lr1 = cr1
        if cr0 > lr0:
            lr0 = cr0
        cr0 = 0
        cr1 = 0
if cr1 > lr1:
    lr1 = cr1
if cr0 > lr0:
    lr0 = cr0
    




if lr1 > lr0:
    print ("Longest run was ones with length: ", lr1)
if lr0 > lr1:
    print ("Longest run was zeros with length: ", lr0)
if lr0 == lr1:
    print ("Equal longest run of ones and zeros with length: ", lr1)
           
