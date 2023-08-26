#1
'''
z=0
for i in range(1,101):
    if i%2==0:
        z+=i
print(f"Zbir je {z}")
'''
#2
'''
x=[5, 7, 9, 4, 2, 1, 3]
p=1
for i in x:
    p*=i
    if i%3==0:
        continue
print(f"Proizvod je {p}")
'''
#3
'''
x = ["primer", "liste", "stringova", "Pajton"]
for i in x:
    print(i[0:2])
    if len(i)==9:
        break
'''
#4
'''
x = ["primer", "liste", "stringova", "Pajton"]
for x, i in enumerate(x):
    print(x, i, len(i))
'''
#5
'''
x=[1, 4, 6, 3, 2, 5, 7, 3]
z=0
for i in x[0::2]:
    z+=i
    print(f"Clan je {i}")
print(f"Zbir je {z}")
'''
#6
'''
from array import array

x=array('i', [1,1])
for i in range(2,11):
    x.append(x[i-1]+x[i-2])
print(x)
'''
#7
'''
from array import array

x=[1, 4, 6, 3, 2, 5, 7, 3]
y=array('i', [])
y.fromlist(x)
print(y)

y.remove(3)
y.remove(3)
y.pop()

print(y)
'''
#8
'''
from array import array
x=array('i',[1, 4, 6, 3, 2, 5, 7, 3])
for i in range(0,len(x)):
    if i==x[i]:
        print(i)
x.reverse()
y=[]
y=x.tolist()
print("Lista: ", y)
print("Niz: ", x)
'''
#9
'''
from array import array
x=array('i',[1, 4, 6, 3, 2, 5, 7, 3])
br=int(input("Broj: "))
n=x.count(br)
print(n)

if n>0:
    x.insert(x.index(br)+1, n)
else:
    x.insert(x[0], n)
print(x)
'''
#10
m=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(3):
    for j in range(3):
        m[i][j]=i*j
print(m)
        

    

    
    
 
    
    
    
    
          
    
    
    
















