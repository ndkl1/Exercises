'''
z=0
for i in range(1,101):
    if i%2==0:
        z+=i
print("Zbir parnih brojeva je ", z)
'''
'''
x=[5, 7, 9, 4, 2, 1, 3]

p=1
for i in x:
    if i%3==0:
        continue
    p*=i
print(p)
'''
'''
x = ["primer", "liste", "stringova", "Pajton"]

for i in x:
    print(i[:2])
    if len(i)==9:
        break
'''
'''
x = ["primer", "liste", "stringova", "Pajton"]

for indeks, vrednost in enumerate(x):
    print(indeks, vrednost, len(vrednost))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
 
z=0
for i in x[0::2]:
    z+=i
    print(i)
print(z)
'''
'''
from array import array

niz=array('i', [1, 1])

for i in range(2,11):
    niz.append(niz[i-2]+niz[i-1])
print(niz)
'''
'''
from array import array
x=[1, 4, 6, 3, 2, 5, 7, 3]

niz=array('i', x)

niz.remove(3)
niz.pop()
print(niz)
'''
'''
from array import array

niz=array('i', [1, 4, 6, 3, 2, 5, 7, 3])

for i in niz:
    if i==niz[i]:
        print(i, " i ", niz[i], ": jednaki.")

niz.reverse()
lista=list(niz)
print(lista)
print(niz)
'''
'''
from array import array

niz=array('i', [1, 4, 6, 3, 2, 5, 7, 3])

ulaz=int(input("Broj: "))
k=niz.count(ulaz)
print("Nalazi se ", k, " puta.")

if niz.count(ulaz)!=0:
    niz.insert(niz.index(ulaz)+1, k)
else:
    niz.insert(0, k)
print(niz)
'''
'''
m=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(3):
    for j in range(3):
        m[i][j]=i*j
print(m)
'''

































