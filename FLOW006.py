#You're given an integer N. Write a program to calculate the sum of all the digits of N.
test_case = int(input())
while(test_case):
    num = input()
    sum = 0
    for i in num:
        sum += int(i)
    print(sum)
    test_case -= 1
    
