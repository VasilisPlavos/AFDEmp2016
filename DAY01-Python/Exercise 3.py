import math

a = float(input("Enter first side:"))
b = float(input("Enter second side:"))
c = float(input("Enter third side:"))

r = ((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)) #oti einai kato apo tin riza
A = (1/4)*math.sqrt(r)
print ("The area of the triangle is", A)
