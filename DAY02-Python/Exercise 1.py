sum = 0
counter = 0
TIN = input("TIN:")
while len(TIN) != 9:
    print ("9 digits please")
    TIN = input("TIN:")
cd = TIN[-1]
for i in range (7, -1, -1):
    counter = counter + 1
    tin = float(TIN[i])*(2**counter)
    sum = sum + float(tin)
mod = sum % 11
mod = mod % 10
mod = int(mod)
cd = int(cd)

if mod == cd:
    print ("Tax Identification Number valid.")
else:
    print ("Tax Identification Number not valid.")

