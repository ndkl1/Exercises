#1
'''
x=[5, 7, 9, 4, 2, 1, 3]
for i in x:
    kk=(i**(1/3))
    print("Kubni koren za ", i, " je ", kk,)
'''
#2
'''
import math
x=[5, 7, 9, 4, 2, 1, 3]
for i in x:
    print(i**(1/2), " i ", math.sqrt(i))
'''
#3
'''
x=[1, 4, 6, 3, 2, 5, 7]
br=int(input("Broj: "))
for i in x:
    print(i, ": ostatak od deljenja je ", i%br)
'''
#4
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
br=int(input("Broj: "))
z=0
for i in x:
    if (i%br)==0:
        print("Broj ", i)
        z+=1
print("Deljivo je ukupno ", z, "brojeva")
'''
#5
'''
import math
x=[1, 4, 6, 3, 2, 5, 7, 3]
for i in x:
    print("Esp je ", math.exp(i), ", a log je ", math.log(i))
'''
#6
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
dg=int(input("Donja granica: "))
gg=int(input("Gornja granica: "))

z=0
for i in x:
    if i>=dg and i<=gg:
        z+=1
print("Ima ",z," brojeva.")
'''
#7
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
z=0
p=1
for i in x:
    if i%3==0:
        z+=i
    elif i%3==1:
        p*=i
    else:
        print(i)
print(z, " i ", p)
'''
#8
'''
x = ["primer", "liste", "stringova", "Pajton"]
y=""
for i in x:
    if len(i)==6:
        y+=i
print(y)
'''
#9
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
p,n=0,0
for i in x:
    if i%2==0 and i>3:
        p+=1
    elif i%2!=0 and i<6:
        n+=1
print(p, " i ", n)
'''
#10
x=[1, 4, 6, 3, 2, 5, 7, 3]
for i in x:
    if i%3==0 or i>5:
        print(i, "ZADOVOLJIO USLOV")
    else:
        print(i, "NIJE ZADOVOLJIO USLOV")











    
    