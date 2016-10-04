import math

a = "a"

while True:
  try:
     a = int(input("Enter the number of triangular numbers to produce:"))
     for i in range(0, a):
         y1=((i**2)+i)/(2)
         print (int(y1), end=" ")
  except ValueError:
     print("Numbers please (eg. 2.123 or 4)")
     continue
  else:
     print("")
