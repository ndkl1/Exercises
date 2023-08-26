# zad 2
'''
x=[5, 7, 9, 4, 2, 1, 3]
br=int(input("Broj 1: "))
br2=int(input("Broj 2: "))
x.append(br)
x.append(br2)

x.reverse()
print(x)
'''

# zad 3
'''
x=[1, 4, 6, 3, 2, 5, 7]
n=int(input("Broj: "))
x.insert(3, n)
x.pop()

k=len(x)

print("Duzina liste je ", k)
print(x)
'''

# zad 4
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
n=int(input("Broj: "))

k=x.count(n)
if k!=0:
    print(x.index(n))
    x.remove(n)
    print(x)
'''

# zad 5
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
for i in x:
    k=x.count(i)
    print(i, " se pojavljuje ", k, " puta.")
'''

# zad 6
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
p=1
z=0
for i in x:
    if i%2==0:
        p*=i
    else:
        z+=i
print("Proizvod parnih je ",p,", a zbir neparnih ",z)
'''
# zad 7
'''
m=int(input("Mata ocena: "))
oe=int(input("OE ocena: "))
s=int(input("Soc ocena: "))

p=(m+oe+s)/3
print("Prosek je ",p)
'''

# zad 8
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
x=set(x)
print(x)

br=int(input("Broj 1: "))
br2=int(input("Broj 2: "))
x.add(br)
x.add(br2)

print(x)
'''
# zad 10
'''
from datetime import datetime

nd=datetime.today()
print(nd)
sd=datetime(2020,3,15)
razlika=nd-sd
print(razlika.days)
'''
#OPET ISPOCETKA 

# 1
'''
x=[5, 7, 9, 4, 2, 1, 3]
max=x[0]
for i in x:
    if i>max:
        max=i
print("Najveca vrednost je ", max)  
'''
#2
'''
x=[5, 7, 9, 4, 2, 1, 3]
n=int(input("Br 1: "))
x.append(n)
n1=int(input("Br 2: "))
x.append(n1)
x.reverse()
print(x)
'''
#3
'''
x=[1, 4, 6, 3, 2, 5, 7]
n=int(input("Broj: "))
x.insert(3, n)
x.pop()
print(x, " i duzina je ", len(x))
'''
#4
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
n=int(input("Broj: "))
s=0
for i in x:
    if i==n:
        s+=1
print("Pojavljuje se", s, " puta.")
i=x.index(n)
print(i)
x.remove(i)
print(x)
'''
#5
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
for i in x:
    n=x.count(i)
    print("Pojavljuje se ", n)
'''
#6
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
z=0
p=1
for i in x:
    if i%2==0:
        p*=i
    else:
        z+=i
print("Zbir je ", z,", a proizvod ", p)
'''
#7
'''
m=int(input("Mata: "))
oe=int(input("OE: "))
s=int(input("Soc: "))
avg=(m+oe+s)/3
print(avg)
'''
#8
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
y=set(x)
print(y)

b1=int(input("Broj 1: "))
y.add(b1)
b2=int(input("Broj 2: "))
y.add(b2)
print(y)
'''
#9
'''
zemlje={'Srbija':'Beograd',
        'Hrvatska':'Zagreb',
        'BiH':'Sarajevo',
        'CG':'Podgorica'}
for i in zemlje.keys():
    if len(zemlje[i])>=7:
        print("Drzava ", i," i glavni grad ", zemlje[i])
'''
#10
'''
from datetime import datetime

sad=datetime.now()
pre=datetime(2020,3,15)

razlika=sad-pre
print(razlika.days)
'''

        




        
























    














