# Java Basics: Math Utilities and Hollow Rectangle (Square1)

A Java practice program covering methods, method overloading, loops and a hollow rectangle star pattern.

## Features

| Method | What it does |
|---|---|
| `factorial(n)` | Returns n! |
| `binomialCoefficient(n, r)` | Returns nCr |
| `calc(...)` | Overloaded addition (2 ints, 3 ints, 2 floats) |
| `isPrime(n)` | Checks whether a number is prime |
| `printPrimes(n)` | Prints all primes from 2 to n |
| `binaryToDecimal(binary)` | Converts a binary number to decimal |
| `decimalToBinary(n)` | Converts a decimal number to binary |
| `hollowRectangle(rows, columns)` | Prints a hollow rectangle of stars |

## Example Output (hollow rectangle 4 x 5)

```
*****
*   *
*   *
*****
```

## How to Run

```bash
javac Star/Square1.java
java Star.Square1
```

## Concepts Used

- Methods and return types
- Method overloading
- Loops (`for`, `while`)
- Number system conversion
- Prime number check up to the square root

## Project Structure

```
.
└── Star
    └── Square1.java
```
## Sample Output (calc, factorial, nCr)

    calc(2, 3) = 5
    calc(2, 3, 4) = 9
    calc(2.5f, 3.5f) = 6.0
    5! = 120
    5C2 = 10

## Sample Output (primes, binary and decimal)

    Primes up to 20:
    2 3 5 7 11 13 17 19 (one per line)
    Decimal of 1011 = 11
    Binary of 11 = 1011

## Notes

- `isPrime` returns false for numbers less than 2.
- `binomialCoefficient` avoids full factorials, so it does not overflow early.
- `binaryToDecimal` expects the binary number as an int made of 0s and 1s (like 1011).
