name = "Ques1.java"
with open(name,'r') as file :
    writable = (file.read())


for x in range(7,32):
    name = "Ques"+str(x)+".java"
    wr = "Ques"+str(x)
    with open(name,'w') as file :
        file.write(writable.replace("Ques1",wr))
