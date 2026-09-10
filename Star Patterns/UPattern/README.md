# "U" Letter Star Pattern (Java)

A Java program that prints the letter **U** using stars, for the size given by the user.

## Example

Input:

```
Enter size: 5
```

Output:

```
*       * 
*       * 
*       * 
*       * 
  * * *   
```

## Logic

The pattern is built from three parts, each checked inside the nested loops:

- **leftSide**: first column, every row except the last
- **rightSide**: last column, every row except the last
- **bottom**: last row, except the first and last columns (this gives the rounded bottom)

If any one of them is true, `* ` is printed, otherwise two spaces.

## How to Run

```bash
javac Star/UPattern.java
java Star.UPattern
```

## Concepts Used

- Nested loops
- Boolean conditions
- User input with `Scanner`
## Sample Run (size 4)

    Enter size: 4
    *     *
    *     *
    *     *
      * *

## Sample Run (size 6)

    Enter size: 6
    *         *
    *         *
    *         *
    *         *
    *         *
      * * * *
