# Star Pattern Printer (Java)

A Java console program that prints a custom star (`*`) pattern of size `a x a`, where `a` is taken as user input.

## How it works
- Takes an integer `a` from the user (grid size).
- Loops through rows (`i`) and columns (`j`) from `0` to `a-1`.
- Prints `*` on a cell when it satisfies one of these conditions:
  - Top row, excluding the first and last column (`i==0 && j!=0 && j!=a-1`)
  - First column of every row except the top row (`i!=0 && j==0`)
  - Middle row, excluding the last column (`i==a/2 && j!=a-1`)
  - Column index `6`, for rows above the middle (`j==6 && i!=0 && i<=a/2-1`)
- Otherwise, prints blank spaces.

## Run it

```bash
javac Pstr.java
java Star.Pstr
```

Enter a value for `a` (grid size) when prompted.

## Example

Input:
```
10
```

Output: a star pattern combining a top border, left border, a horizontal line at the middle row, and a partial vertical line at column 6.