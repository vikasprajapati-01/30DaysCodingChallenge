import time

def introduction():
    print("Welcome to the Text-Based Adventure Game!")
    print("You find yourself in a dark, mysterious cave.")

def choose_path():
    print("\nChoose your path:")
    print("1. Go left into a narrow tunnel.")
    print("2. Go right towards a dim light.")
    return input("Enter 1 or 2: ")

def left_path():
    print("\nYou venture into the narrow tunnel.")
    time.sleep(2)
    print("It becomes darker as you go further.")
    time.sleep(2)
    print("Suddenly, you encounter a swarm of bats!")
    time.sleep(2)
    print("What do you do?")
    print("1. Try to fight the bats.")
    print("2. Retreat back to the cave entrance.")
    return input("Enter 1 or 2: ")

def right_path():
    print("\nYou walk towards the dim light.")
    time.sleep(2)
    print("As you get closer, you see a treasure chest.")
    time.sleep(2)
    print("What do you do?")
    print("1. Open the treasure chest.")
    print("2. Ignore the chest and continue exploring.")
    return input("Enter 1 or 2: ")

def main():
    introduction()

    while True:
        choice = choose_path()

        if choice == "1":
            sub_choice = left_path()
            if sub_choice == "1":
                print("\nYou bravely fight the bats, but they overwhelm you. Game over!")
                break
            elif sub_choice == "2":
                print("\nYou wisely retreat to the cave entrance.")
        elif choice == "2":
            sub_choice = right_path()
            if sub_choice == "1":
                print("\nYou open the treasure chest and find a key. You win!")
                break
            elif sub_choice == "2":
                print("\nYou decide to explore further and discover a hidden passage.")


main()
