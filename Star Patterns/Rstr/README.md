# Triangle with Diagonal Star Pattern (Java)

A Java console program that prints a right-triangle pattern with a diagonal, of size `a x a`, where `a` is taken as user input.

## How it works
- Takes an integer `a` from the user (grid size).
- Loops through rows (`i`) and columns (`j`) from `0` to `a-1`.
- Prints `*` on a cell when it satisfies one of these conditions:
  - `i == j` — the main diagonal
  - `j == 0` — the left border (first column of every row)
  - `i == a - 1` — the bottom border (last row)
- Otherwise, prints blank spaces.

Together these form a left border, a bottom border, and a diagonal connecting the top-left to the bottom-right — like a right triangle with its hypotenuse drawn in.

## Run it

```bash
javac Rstr.java
java Star.rectangle
```

Enter a value for `a` (grid size) when prompted.

## Example

Input:
```
6
```

Output: a left vertical line, a bottom horizontal line, and a diagonal line from top-left to bottom-right, forming a triangle shape.