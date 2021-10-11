# power-bill-calculator
A program to calculate a power bill based on customer usage.

## Assignment
Write a program that asks for the customer's last name and current meter reading in Kilowatt Hours (KwHs).
Determine the amount of usage for the month and calculate a sub-total (before tax) and a total amount due (including tax) using given constraints.

## Constraints
- Rate A: For 500 KwHs or less = $0.0809 / KwH
- Rate B: For 501 to 900 KwHs = $0.091 / KwH
- Rate c: For greater than 900 KwHs = $0.109 / KwH
- Utilities Tax = 3.46% (regardless of usage)

## Requirements
- Use a method to determine the usage.
- Use a second method to determine the tax.
- Use a third method to determine the subtotal.
- Format all output as follows:
  - Usage to 1 decimal place, KhWs.
  - Rate to 4 decimal places, monetary.
  - Subtotal to 2 decimal places, monetary.
  - Taxes to 2 decimal places, monetary.
  - Total to 2 decimal places, monetary.
- Implement a loop to run the program again if the user wishes to.
