import math

y = 0
while y < 1901 or y > 2100:
    y = input("Please enter a year  between 1900 and 2099:")
    y = int(y)

a = y % 4
b = y % 7
c = y % 19
d = (19*c + 15) % 30
e = (2*a + 4*b - d + 34) % 7
month = ((d+e+114) / 31)
day = ((d + e + 114) % 31) + 1
day13 = int(day) + 13
month13 = int(month)

import calendar
monthcheck = calendar.monthrange(y, month13)
while day13 > monthcheck[1]:
  month13 = month13 + 1
  day13 = day13 - monthcheck[1]


import datetime
datetime.date(y, month13, day13)
print ("Day:", day13, "Month:", month13)
