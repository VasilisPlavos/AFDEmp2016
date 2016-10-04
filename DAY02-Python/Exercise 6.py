print ("Enter 9 numbers: 1 with 1 digit, 1 with 2 digits, 1 with 3 digits, then again 1 with 1 digit, 1 with 2 digits,1 with 3 digits, and then again 1 with 1 digit, 1 with 2 digits, 1 with 3 digits.")
print ("")
n = input('Input your numbers: ').split(' ')            #numbers
k = 2                                                   #kena
i = 0

while k != -1:
  print (k*" "+str(int(n[i]))+"|"+k*" "+str(int(n[i+3]))+"|"+k*" "+str(int(n[i+6])))
  k = k-1
  i = i + 1
