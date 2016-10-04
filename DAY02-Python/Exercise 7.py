dates = input('Enter a date (dd/mm/yyyy): ').split(' ')           #dates
d1s = dates[0].split('/')
d2s = dates[1].split('/')
d1 = int(d1s[0])
m1 = int(d1s[1])
y1 = int(d1s[2])
d2 = int(d2s[0])
m2 = int(d2s[1])
y2 = int(d2s[2])
c1 = 365*y1 + (y1/4) - (y1/100) + (y1/400) + (((306*m1) +5)/10) + (d1 - 1)
c2 = 365*y2 + (y2/4) - (y2/100) + (y2/400) + (((306*m2) + 5)/10) + (d2 -1)


sum = abs(c2 - c1)

print (int(sum))
