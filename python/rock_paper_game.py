import random
def rock_paper_game():
	print("Welcome to my rock paper game ")

make_choice = ['rock', 'paper', 'scissors' ]
choice_play = input("play your choice (rock, paper, scissors):")

if choice_play != make_choice:
	print("Invalid entry please try again later")


computer_choice = random.choice(make_choice)
print(f"the computer choose {computer_choice}")

if choice_play == computer_choice:
	print("It's a tie")
	
elif	choice_play == "rock" and computer_choice == "scissors":
	print("you win")
elif	choice_play == "scissors" and computer_choice == "paper":
	print("you win")
elif	choice_play == "paper" and computer_choice == "rock":
	print("you win")
else :
	print("computer wins")
