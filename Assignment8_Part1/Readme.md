
<h3>Factorial Calculation with Exception Handling</h3>
This Java program calculates the factorial of an integer between 0 and 15, and throws a custom exception if the input is out of range.

The program takes one or more integer arguments from the command line, and calculates the factorial of each integer using a simple for loop. If the input is invalid (i.e. not an integer, or outside the range of 0 to 15), the program throws a custom MyExcep exception with an error message.

The MyExcep class is a custom exception that extends the base Exception class. It takes a String message as input, and passes it to the base constructor using the super keyword.

The program uses try-catch blocks to handle exceptions, and prints error messages to the console if an exception occurs. If the input is valid, the program prints the calculated factorial to the console.
