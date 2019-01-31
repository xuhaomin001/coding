#coding=utf-8
def  substr(str1):
    str3=list(str1)
    str2=""
    for i in range(len(str1)):
        if (str2.find(str3[i])!=-1):
            pass
        else:
            str2=str2+str3[i]
    return str2
#substr(str1)