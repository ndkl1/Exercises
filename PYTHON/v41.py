#1
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
k=x.count(3)

for i in x:
    if i==3:
        x.remove(i)
print(x)
'''
#2
'''
x=[1, 4, 6, 3, 2, 3, 5, 7, 3]
y=[]
k=x.count(3)
for i in range(k):
    if i==0:
        y.append(x.index(3))
    else:
        y.append(x.index(3, y[i-1]+1))
print(y)    
'''
#3
'''
x=[1,1]

for i in range(2, 11):
    x.append(x[i-1]+x[i-2])
print(x)
'''
#4
'''
x=[5, 7, 9, 4, 2, 1, 3]
y=[5, 7, 9, 4, 2, 1, 3]
x.sort()
print(x)
y.sort(reverse=True)
print(y)

z=0
for a,b in zip(x,y):
    z=z+(a*b)    
print(z, x, y)
'''
#5
'''
x=[5, 7, 9, 4, 2, 1, 3]
y=[5, 7, 9, 4, 2, 1, 3]
y.sort()
for i in y:
    x[i]=x.index(y[i])
x.extend(y)
print(y)
'''
#6
'''
x = ["primer", "liste", "stringova", "Pajton"]
y=" ".join(x)
for i in x:
    u=i.upper()
    t=i.title()
    print(u," ",t)
print(y)
print(y.title())
'''
#7
'''
x="primer liste stringova Pajton"
y=x.split(" ")
print(y)

for i in y:
    print("Duzina ", i, " je ", len(i))

y.sort()
print(y)
y="-".join(y)
print(y)
'''
#8
'''
x = ["primer", "liste", "stringova", "Pajton"]
for i in x:
    print(i," ", i.isalpha())
    if i.startswith("li"):
        print(i," pocinje sa li")
    else: continue
'''
#9
'''
import random
x=[1, 4, 6, 3, 2, 5, 7, 3]
random.shuffle(x)
print(x)
c=random.choice(x)
print(c)
'''
#10
import random
x=[]
y=[]
for i in range(7):
    li=random.randrange(1, 40)
    pk=random.randrange(1, 40)
    x.append(li)
    x.sort()
    y.append(pk)
    y.sort()
print(x)
print(y)

z=0
for i in x:
    if y.count(i)>0:
        z+=1;
print("Ima ",z," pogodaka.")


























