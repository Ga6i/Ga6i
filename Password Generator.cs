using System;

class PasswordGenerator
{
    static void Main()
    {
        //Prompt user to enter number of desired passwords
        Console.Write("How many passwords do you want to create? ");
        int numberOfPasswords = int.Parse(Console.ReadLine());

        for (int i = 0; i < numberOfPasswords; i++)
        {
            //User must enter their full name in the format "forname surname
            Console.Write("Enter the employee's full name in the format 'forename surname': ");
            string fullName = Console.ReadLine();

            // Generate the password based on the rules
            string password = GeneratePassword(fullName);

            Console.WriteLine($"Generated Password: {password}");
        }
    }

    static string GeneratePassword(string fullName)
    {
        //Initialise variables to store the password  and count the eliminated letter
        string password = "";
        int eliminatedCount = 0;

        //Define a string of vowels to be duplicated
        string vowels = "IOU";

        
        foreach (char c in fullName)
        {
            char lowercaseChar = char.ToLower(c); //Convert to lowercase for case-insensitive comparison
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 't')
            {
                eliminatedCount++;
            }
            else if (vowels.Contains(lowercaseChar))
            {
                //Dupliacte vowels
                password += c;
                password += c;
            }
            else if (char.IsWhiteSpace(c))
            {
                //Replace spaces with "S&?"
                password += "S&?";
            }
            else
            {
                //Keep other characters unchanged
                password += c;
            }
        }

        //Append the count of eliminated letters
        password += eliminatedCount;

        return password;
    }
}
