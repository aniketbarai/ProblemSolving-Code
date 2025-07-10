# Here you are given time limit of 30min to watch the chef content if you exceed the time limit of 30min you have to buy a subscription to continue. so this code print yes if you need to buy else it will print no...
test_case = int(input())
while(test_case):
    n = int(input(""))
    if(n > 30):
        print("YES")
    else:
        print("NO")
    test_case-=1
