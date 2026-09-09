# "S" Letter Star Pattern (Java)

A Java program that prints the letter **S** using stars, for the size given by the user.

## Example

Input:

```
Enter size (odd number, 5 or more): 5
```

Output:

```
  * * * * 
*         
  * * *   
        * 
* * * *   
```

## Logic

The pattern is built from five parts, each checked inside the nested loops:

- **top**: first row, except the first column
- **middle**: middle row, except the first and last columns
- **bottom**: last row, except the last column
- **leftSide**: first column, rows between the top and the middle
- **rightSide**: last column, rows between the middle and the bottom

If any one of them is true, `* ` is printed, otherwise two spaces.

## How to Run

```bash
javac Star/SPattern.java
java Star.SPattern
```

Use an odd size of 5 or more for a symmetric result.

## Concepts Used

- Nested loops
- Boolean conditions
- User input with `Scanner`
## Sample Run (size 7)

    Enter size (odd number, 5 or more): 7
      * * * * * * 
    *
    *
      * * * * *
                *
                *
    * * * * * *

## Sample Run (size 9)

    Enter size (odd number, 5 or more): 9
      * * * * * * * * 
    *
    *
    *
      * * * * * * *
                    *
                    *
                    *
    * * * * * * * *
