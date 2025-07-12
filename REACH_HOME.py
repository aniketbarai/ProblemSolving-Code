# Chef is hungry and wants to reach home.Chef can travel up to 5km kilometres on 1 litre of fuel on his motorcycle.
# Currently, his motorcycle is filled with X litres of fuel and his home is Y kilometres away. Determine whether Chef can reach his home on his motorcycle or not.

test_case = int(input(""))
while(test_case):
    litre,home_km = map(int,input("").split())
    if((litre*5) >= home_km):
        print("YES")
    else:
        print("NO")
    test_case -= 1
    
