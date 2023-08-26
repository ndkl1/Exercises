'''
x=[5, 7, 9, 4, 2, 1, 3]

for i in x:
    print("Kubni koren ", i, "je", i**(1/3))
'''

'''
import math

x=[5, 7, 9, 4, 2, 1, 3]

for i in x:
    
    print("Kvadratni koren je ", i**(1/2), math.sqrt(i))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7]

ulaz=input("Broj: ")
ulaz=int(ulaz)

for i in x:
    print("Ostatak pri deljenju ", i, "sa ", ulaz, "je ", i%ulaz)
    print(divmod(i, ulaz))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7]

ulaz=int(input("Broj: "))

c=0
for i in x:
    if i%ulaz == 0:
        print("Broj ", i, "je deljiv brojem ", ulaz)
        c+=1
print(c)
'''
'''
import math
x=[1, 4, 6, 3, 2, 5, 7]

for i in x:
    print(i, " :logaritam: ", math.log(i), " i ekoponencijalna: ", math.exp(i))
'''
'''
x=[1, 4, 6, 3, 2, 5, 7]

pi=int(input("Pocetak intervala: "))
ki=int(input("Kraj intervala: "))

c=0
for i in x:
    if pi <= i <= ki:
        print(i, " se nalazi u ovom intervalu")
        c+=1
print(c)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7]

s=0
p=1

for i in x:
    if i%3 == 0:
        s+=i
    elif i%3 == 1:
        p*=i
    else:
        print(i)
print("Zbir je ", s, ", a proizvod je ", p)
'''
'''
x = ["primer", "liste", "stringova", "Pajton"]

st=""
for i in x:
    if len(i) == 6:
        st += i
print(st)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

c=0
k=0
for i in x:
    if i%2 == 0 and i > 3:
        c+=1
    elif i%2 != 0 and i < 6:
        k+=1
print("Prvih je ", c, ", a drugih ", k)
'''
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]

for i in x:
    if i%3==0 or i>5:
        print(i, "TRUE")
    else:
        print(i, "FALSE")
    '''



















    
    

















    