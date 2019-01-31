#coding=gbk
import  json
import  substr
import  count
def findmaxchar():
    f = open('w.log','r')
    s = f.read()
    str=s.replace("\t","")
    str0=str.replace("\n","")
    str1=unicode(str0.replace(" ",""),'UTF-8')
    print str1
    dict={}
    str2=substr.substr(str1)
    print str2
    str3=list(str2)
    flag=count.count(str1,str3[0]);
    for i in range(str3.__len__()):
        dict[str3[i]]=count.count(str1,str3[i])
    print json.dumps(dict,encoding="utf-8",ensure_ascii=False)
    for k,v in dict.items():
        if flag<v:
            flag=v
        else:
            pass
    for k, v in dict.items():
        if(v==flag):
            print k,v



findmaxchar()