# Hollow Square Star Pattern (Java)

A simple Java program that prints a **hollow square** star pattern of the size given by the user.

## Example

Input:

```
Enter size of square: 5
```

Output:

```
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
```

## Logic

- The outer loop (`i`) handles rows and the inner loop (`j`) handles columns.
- If the cell is in the first/last row or the first/last column, print `* `.
- Otherwise print two spaces (`"  "`) to keep the inside empty.

## How to Run

```bash
javac Star/Square.java
java Star.Square
```

## Concepts Used

- Nested loops
- Conditional statements
- User input with `Scanner`

## Project Structure

```
.
├── README.md
└── Star
    └── Square.java
```
## Sample Run (size 3)

    * * * 
    *   * 
    * * * 

## Sample Run (size 4)

    * * * * 
    *     * 
    *     * 
    * * * * 
