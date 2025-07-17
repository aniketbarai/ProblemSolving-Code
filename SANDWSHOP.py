#Chef sells sandwiches for a living. Each sandwich is sold for A rupees.
#Chef also needs to buy the ingredients to make a sandwich. The sandwich buns cost B rupees, and the vegetables cost C rupees. Let us assume that there are no other costs for Chef right now.
#What is the profit Chef makes in selling one sandwich? It may be possible that the answer is negative to indicate that Chef makes a loss instead.
sell_price,bun,vegies = map(int, input().split())
total_expense = bun + vegies
print(sell_price - total_expense)
