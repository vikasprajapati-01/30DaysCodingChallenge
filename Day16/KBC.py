
questions = [["What is the capital of France?", "Berlin" , "Madrid", "Paris","Rome" , 3],
             ["Which planet is known as the 'Red Planet'?", "Venus", "Mars", "Mercury", "Jupiter",2],
             ["What is the largest mammal on Earth?", "Elephant", "Giraffe", "Blue Whale", "Polar Bear",3],
             ["Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain",2],
             ["What is the powerhouse of the cell?","Nucleus","Mitochondria","Ribosome","Endoplasmic reticulum",2],
             ["Which of the following is a primary color?" , "Green", "Orange" , "Purple", "Blue",4],
             ["In which year did the Titanic sink?", "1912", "1920", "1905","1931",1],
             ["What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Cu",1],
             ["Which country is known as the 'Land of the Rising Sun'?", "China", "Japan", "South Korea", "Vietnam",2],
             ["What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Southern Ocean", "Pacific Ocean",4]]

levels = [1000,2000,3000,5000,10000,25000,50000,100000,150000,250000]
ans = 0
for i in range(0,10):
    each = questions[i]
    print(f"Question {i+1} for Rs.{levels[i]}")
    print(each[0])
    print(f"1. {each[1]}        2. {each[2]}")
    print(f"3. {each[3]}        4. {each[4]}")
    a = int(input("Enter the option : "))
    if(a == each[5]):
        print(f"Correct answer you won Rs.{levels[i]}")
        if(i == 4):
            ans = 10000
        elif(i == 7):
            ans = 100000
        elif(i == 9):
            ans = 250000
    else:
        print("The answer is wrong...")
        break

print(f"The Amount you have won is {ans}")