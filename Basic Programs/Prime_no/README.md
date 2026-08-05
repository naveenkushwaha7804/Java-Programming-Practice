# Prime Numbers from 1 to N (Java)

## Overview

This Java program prints all **prime numbers from 1 up to a user-specified number (N)**.

A prime number is a natural number greater than 1 that has exactly two positive divisors: **1 and itself**.

---

## Problem Statement

Write a Java program that accepts an integer `N` from the user and prints all prime numbers in the range **1 to N**.

---

## Approach

The program checks every number from **2 to N**.

For each number:

- Check if it is divisible by any number between `2` and `number - 1`.
- If no divisor exists, the number is prime.
- Print the prime number.

---

## Algorithm

1. Read an integer `N`.
2. Iterate from `2` to `N`.
3. For each number:
   - Check divisibility from `2` to `number - 1`.
   - If divisible, it is not prime.
   - Otherwise, print the number.

---

## Example

### Input

```text
20
```

### Output

```text
2
3
5
7
11
13
17
19
```

---

## Complexity Analysis

**Time Complexity:** `O(N²)`

- Each number is checked against multiple possible divisors.

**Space Complexity:** `O(1)`

- No extra data structures are used.

---

## Concepts Used

- Loops
- Nested Loops
- Conditional Statements
- Prime Number Logic
- User Input (`Scanner`)

---

## Project Structure

```text
PrimeNumbers/
│── PrimeNumber.java
└── README.md
```

---

## Future Optimization

The current solution checks divisibility up to `number - 1`.

It can be optimized by checking only up to **√number**, reducing the time complexity significantly.

---

## Author

**Naveen Kushwaha**

GitHub: https://github.com/naveenkushwaha7804