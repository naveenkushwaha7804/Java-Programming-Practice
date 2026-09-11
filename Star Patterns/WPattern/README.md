# "W" Letter Star Pattern (Java)

A Java program that prints the letter **W** using stars, for the size given by the user.

## Example

Input:

```
Enter size (5 or more): 5
```

Output:

```
*       * 
*       * 
*   *   * 
* *   * * 
*       * 
```

## Logic

The pattern is built from four parts, each checked inside the nested loops:

- **leftSide**: first column
- **rightSide**: last column
- **leftDiagonal**: cells where `i == j`, from the middle row down
- **rightDiagonal**: cells where `i + j == size - 1`, from the middle row down

If any one of them is true, `* ` is printed, otherwise two spaces.

## How to Run

```bash
javac Star/WPattern.java
java Star.WPattern
```

## Concepts Used

- Nested loops
- Boolean conditions
- Diagonal logic with row and column indexes
- User input with `Scanner`