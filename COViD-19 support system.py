COVID-19 Support System

def print_statistics():
    print("Currently in SA there are 27403 confirmed cases\n Currently in USA there are 1700000 confirmed cases\n Currently in China there are 82995 confirmed cases")
    country=input("Would you like to see the confirmed cases for a random country?\n y/n: ")
    def yes():
        print()

    while country:
        country=str(input("To select a random country, type a number from 0 to 9:"))
    if country=="y":
        print(yes)
    else:
        pass

        def seven():
            print("Currently in Australia there are 7155 confirmed cases")
            print()

            b=0    
            while b !=7:
                if b==7:
                    print(seven)
                else:
                    pass
                
def print_prevention():
    print("To prevent the spread of COVID-19\n Clean your hands often. Use soap and water, or an alcohol-based hand rub.\n Maintain a safe distance from anyone who is coughing or sneezing\n Don't touch your eyes, nose or mouth\n Cover your nose or mouth with your bent elbow or a tissue when you cough or sneeze.\n Stay home if you feel unwell.\n If you have a fever, cough, and difficulty breathing, seek medical attention. Call in advance.\n Follow the directions of your local health authority.")

def print_symptoms():
    print("Most common symptoms:\n Fever\n Dry cough\n Tiredness\n Less common symptoms:\n Aches and pains\n Sore throat\n Diarrhoea\n Conjuctivitis\n Headache\n Loss of taste or smell\n A rash on skin, or discolouration of fingers or toes\n Serious Symptoms:\n Difficulty breathing or shortness of breath\n Chest pain or pressure\n loss of speech or movement")

def print_treatment():
    print("If you feel sick, you should rest, drink plenty of fluid, and eat nutritious food. Stay in a seperate room from other family members, and use a dedicated bathroom if possible. Clean and disinfect frequently touched surfaces.")

def print_report_case():
    print("Report a case")
    report=input("Do have any of the symptoms?y/n: ")
    
    while report:
        report=str(input())
        if report=="y":
            print("Is your temperature above 38.5\u00B0? y/n: ")
        elif report=="n":
            print("You do not have covid19")
            pass
    def result():
        print("You have COVID19. Please see Treatment")
        while country_report:
            country_report=input("In which country are you? Select an option below:\n 1.SA\n 2.USA\n 3.China ")
            if country_report==1:
                print(result)
            elif country_report==2:
                print(result)
            elif country_report==3:
                print(result)
            else:
                pass

run_program=True
while run_program:
    print("Welcome to the COVID 19 support service. Please select an option below")
    print("1. Statistics\n2. Prevention\n3. Symptoms\n4. Treatment\n5. Report case\n6. Exit")
    option=input("Enter choice(1/2/3/4/5/6): ")
    if option=="1":
        print_statistics()
    if option=="2":
        print_prevention()
    if option=="3":
        print_symptoms()
    if option=="4":
        print_treatment()
    if option=="5":
        print_report_case()
    elif option=="6":
        print("Thank you, Goodbye!")
        run_program=False
