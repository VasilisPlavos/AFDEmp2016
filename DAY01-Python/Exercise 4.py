import math
a, b, c = "a", "b", "c"
while True:
  try:
     a = float(input("Enter value a:"))
     b = float(input("Enter value b:"))
     c = float(input("Enter value c:"))
  except ValueError:
     print("Numbers please (eg. 2.123 or 4)")
     continue
  else:
     print("")
     break 

d = b**2-4*a*c
r = (b**2 - (4 * a * c))

if d < 0:
    print ("This equation has no real solution")
elif d == 0:
    x = (-b+math.sqrt(r))/2*a
    print ("This equation has one solutions: ", x)
else:
    x1 = (-b+math.sqrt(r))/2*a
    x2 = (-b-math.sqrt(r))/2*a
    print ("This equation has two solutions: ", x1, " and", x2)
