

dict = {
    "Naruto" : "NarutoUzumaki",
    "Onepiece" : "Luffy",
    "Bleach" : "Ichigo",
    "DragonBall" : "Goku",
    12 : "Sasuke",
    13 : "Zoro",
    14 : "Vegita",
    101 : 1010101
}

print(dict["Bleach"])
print(dict[12])
# print(dict[888])  
# As the given key is not present in the dict variable it will give error but on using "get" ..Their will be no error
print(dict.get(888))

print(dict.keys())
print(dict.values())

for i in dict.keys():
    print(f"The value corresponding to {i} is {dict[i]}")

print("\n")
print("By using using items")

print(dict.items())

for i , j in dict.items():
    print(f"The value to key {i} is {j}")

print("\n")
print("Using some basic methods of dictionaries \n")
# Some methods of dictionaries
 
#update() ... Updates a value of the dictionary with other dictionary
ep1 = {123 : 32 , 124 : 45 , 125 : 55 , 200 : 88}
ep2 = {101 : 12, 102 : 5}

ep1.update(ep2)
print("After updating the dictionary 1 " ,ep1)

# pop() ... Deletes a particular key, value pair 
ep1.pop(125)
print(ep1)

#popitem() ... Removes the last key value pair
ep1.popitem()
print(ep1)

#clear() ... Removes all the elements in the variable
ep1.clear()
print(ep1)

#del() ... Deletes the dictionary
del ep1