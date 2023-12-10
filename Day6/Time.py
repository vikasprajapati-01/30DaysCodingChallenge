
import time

# timestamp = time.strftime('%H:%M:%S')
# print(timestamp)

# timestamp = time.strftime('%H')
# print(timestamp)
# timestamp = time.strftime('%M')
# print(timestamp)
# timestamp = time.strftime('%S')
# print(timestamp)

# hour = int(time.strftime('%H'))

hour = int(input("Enter the hour : "))

if(hour >= 0 and hour < 12):
    print("Good morning !!!")
elif(hour >= 12 and hour < 18):
    print("Good afternoon !!!")
elif(hour >= 18 and hour < 0):
    print("Good night !!!")