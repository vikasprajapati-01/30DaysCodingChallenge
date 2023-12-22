# Short Hand if-else

a = int(input("Enter a number : "))
b = int(input("Enter another number : "))

print("First is greater") if a > b else print("Both equal") if a == b else print("Second is greater")

c = -1 if a < b else 1
print(c)

# Enumerate Function
# enumerate key gives us the index value along with the list elements

marks = [34,65,54,86,25,98,78,68,18]

for index, mar in enumerate(marks):
    print(mar)
    if(index == 3):
        print("Hello...!")