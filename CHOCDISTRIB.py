test_cases = int(input())
for _ in range(test_cases):
    chocolates = int(input())
    maximum = chocolates
    if chocolates % 2 == 0:
        minimum = chocolates // 2
    else:
        minimum = (chocolates // 2) + 1
    print(minimum, maximum)
