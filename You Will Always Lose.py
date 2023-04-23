import random


print('''Welcome to YOU WILL ALWAYS LOSE!
============================================
Win big or go home with nothing!
============================================
Get 3 of the same number to get double what you played.
============================================ 
''')
credits= 100
def calculate_winnings(winning_combos):

    spend = float(input("You currently have "+ str(credits) + " credits. How much would you like to play?: "))
    total_spent = (credits - spend)
    total_prize = (prize)
    
    print(winning_combos)

    
    def play():
        while spend >= 100 and credits == True:
            if spend > 100:
                print("You seem to be too broke to do that, Goodbye!")
                False

    #calculate user winnings

    if winning_combos[0] == winning_combos[1] and winning_combos[1] == winning_combos[2]:
        prize = (spend * 2) + credits
        total_prize.append(prize)
        print(f'You got three matches and you won ' +str(prize)+'credits')
    else: 
        print(f'You did not win. You currently have' +str(credits-spend)+ 'credits.') 
    
    play = input(f'Would you like to play? Y/N?: ').upper()
    while play == 'Y':
        calculate_winnings(winning_combos)
        print("You currently have "+ str(prize) + " credits. How much would you like to play?: ")
    if play == 'N':
        print(f'You have cashed out '+ str(total_prize) +'credits')
        print('Come lose again!!!!! Hahahaha')

#loop through game as many times as user wants

def main():

    # slot machine values
    
    slot_machine_values = range(1,9)
    winning_combos = []
    #calculate random values from above list
    for x in range(3):
        winning_value = random.choice(slot_machine_values)
        winning_combos.append(winning_value)
    
    calculate_winnings(winning_combos)
main()