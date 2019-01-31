def sort():
    mylist = [1, 8, 9, 5]
    n = len(mylist)
    print n
    i=0; j=0
    for i in range(n):
        for j in range(i+1,n):
            if mylist[i]> mylist[j]:
                t = mylist[i]
                mylist[i]=mylist[j]
                mylist[j]=t
    print mylist
sort()
