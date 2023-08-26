'''
x=[5,7,9,4,2,1,3]

m=x[0]

for vrednost in x:
    if vrednost > m:
        m = vrednost
        

print("Maksimum je ", m)
'''

'''
x=[5, 7, 9, 4, 2, 1, 3]

ulaz=input("Element 1: ")
x.append(ulaz)
ulaz1=input("Element 2: ")
x.append(ulaz1)
ulaz2=input("Element 3: ")
x.append(ulaz2)
print(x)

x.reverse()
print(x)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7]

ulaz=input("Unesi element: ")
x.insert(3, ulaz)
x.pop()

print(x)
print(len(x))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

ulaz=input("Ucitaj element: ")
ulaz=int(ulaz)

prebrojavanje=x.count(ulaz)
print(prebrojavanje)

if prebrojavanje > 0:
    print("Broj sa ulaza se nalazi na pozicijama: ", x.index(ulaz))
    x.remove(ulaz)
    print(x)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

for i in x:
    print("Element ", i, "se pojavljuje ", x.count(i))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

zbir=0
proizvod=1

for i in x:
    if i%2 != 0:
        zbir+=i
    else:
        proizvod*=i
        
print("Zbir neparnih brojeva je ", zbir, ", a proizvod parnih je ", proizvod)
'''
'''
ulaz=input("Ocena iz predmeta Mata: ")
ulaz=int(ulaz)
ulaz1=input("Ocena iz predmeta OE: ")
ulaz1=int(ulaz1)
ulaz2=input("Ocena iz predmeta Soc: ")
ulaz2=int(ulaz)

prosek=(ulaz+ulaz1+ulaz2)/3

print("Prosek ocena ova tri predmeta je ", prosek)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

y=set(x)
print(y)

br1=input("Broj 1: ")
br1=int(br1)
br2=input("Broj 2: ")
br2=int(br2)

y.add(br1)
y.add(br2)
print(y)
'''
'''
gradovi = {'Srbija': 'Beograd',
     'Hrvatska': 'Zagreb',
     'CG': 'Podgorica',
     'BiH': 'Sarajevo',
     'Makedonija': 'Skopje'}

for i in gradovi.keys():
    if len(gradovi[i]) >= 7:
        print(i)
'''
'''
import datetime

sad=datetime.date.today()
datum=datetime.date(2020,3,15)

d=sad-datum

print(d)
'''




































