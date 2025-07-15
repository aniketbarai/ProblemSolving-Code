#Chef considers the climate HOT if the temperature is above 20, otherwise he considers it COLD. You are given the temperature C,find whether the climate is HOT or COLD.
test_case = int(input())
while(test_case):
    temp = int(input())
    if(temp > 20):
        print("HOT")
    else:
        print("COLD")
    test_case -= 1