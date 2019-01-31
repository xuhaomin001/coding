def count(str1,key):
    count=0
    while(str1.find(key)!=-1):
        i=str1.find(key)
        count=count +1
        str1= str1[i + 1:]
    return count

key="f"



