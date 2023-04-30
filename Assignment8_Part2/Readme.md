<h3>Unmatched String</h3>
The program is a simple Java program that takes input from the user and checks if the input matches a specific string. If the input does not match the specified string "India", it throws a custom exception NOMATCHEXCP with an error message that includes the line number and the input string that did not match.

The program first creates a Scanner object to read input from the user. It then prompts the user to enter a string, and reads the input using the nextLine() method.

Next, the program checks if the input string matches the expected value "India". If the input does not match, the program throws a custom NOMATCHEXCP exception with an error message that includes the line number and the input string that did not match.

The NOMATCHEXCP class is a custom exception that extends the base Exception class. It takes two parameters: the line number where the user input is taken, and the input string that did not match. It passes these parameters to the base constructor using the super keyword, along with a custom error message that includes these parameters.

The program uses a try-catch block to catch the NOMATCHEXCP exception and print the error message to the console.

Overall, this program demonstrates how to use custom exceptions in Java to handle errors and provide informative error messages to the user.
