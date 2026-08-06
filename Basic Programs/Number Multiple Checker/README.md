# Number Multiple Checker (Java)

## Overview

This Java program checks whether one number is a multiple of another number entered by the user.

It takes two integer inputs and determines if the second number is exactly divisible by the first number using the modulus (`%`) operator.

---

## Problem Statement

Write a Java program that accepts two integers from the user and checks whether the second number is a multiple of the first number.

If the remainder is `0`, the number is a multiple; otherwise, it is not.

---

## Approach

The program performs the following steps:

- Read the first integer.
- Read the second integer.
- Use the modulus (`%`) operator.
- If the remainder is `0`, print that it is a multiple.
- Otherwise, print that it is not a multiple.

---

## Algorithm

1. Read the first integer.
2. Read the second integer.
3. Calculate:

   ```java
   secondNumber % firstNumber
   ```

4. If the result is `0`, print **Multiple**.
5. Otherwise, print **Not a Multiple**.

---

## Example

### Input

```text
Enter the first number:
10

Enter the second number:
50
```

### Output

```text
50 is a multiple of 10.
```

---

### Input

```text
Enter the first number:
8

Enter the second number:
45
```

### Output

```text
45 is not a multiple of 8.
```

---

## Complexity Analysis

**Time Complexity:** `O(1)`

- Only one modulus operation is performed.

**Space Complexity:** `O(1)`

- Constant extra memory is used.

---

## Concepts Used

- Java
- Scanner Class
- User Input
- Conditional Statements (`if-else`)
- Modulus Operator (`%`)

---

## Project Structure

```text
Number Multiple Checker/
│── MultipleChecker.java
└── README.md
```

---

## Author

**Naveen Kushwaha**

GitHub: https://github.com/naveenkushwaha7804