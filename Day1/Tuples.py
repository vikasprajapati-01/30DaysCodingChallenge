
# Tuples
# Tuples are immutable ,which means values cannot be changed once given
# They are similar to lists but use "()" instead of "[]"

tup1 = (1,2,3)
tup2 = (1)     # This becomes an Integer type 
tup3 = (1,)

print(type(tup2) , type(tup3) , tup1)

# In list we can change the elements present in it but we cannot change in tuples

l1 = [12, 33, 44, 54, 67, 43]
print("The lists elements are " , l1)

l1[0] = 45
l1[4] = 88
a=0

print("List elements after changing some elements " , l1)

t1 = (45,56,72,21,32,65)
print("The elements of Tuple are " , t1)
print("We cannot change elements of the Tuple")

print("The third element of tuplet is" , t1[2])