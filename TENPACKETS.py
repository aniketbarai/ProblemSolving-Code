#Chef wants buy 10 packets of an item. As it is festive season, Chef can buy 2 packets for a total of X rupees 4 packets for a total of Y rupees.Determine the minimum cost Chef needs to pay to buy 10 packets,if Chef can only buy packets of 2 and 4.
test_case = int(input())
while(test_case):
    price_twoPack, price_fourPack = map(int,input().split())
    min = (price_fourPack*2)+price_twoPack
    max = price_twoPack*10
    if(max > min):
        print(min)
    else:
        print(max)
    test_case -= 1
    