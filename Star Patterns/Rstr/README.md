# "E"-Shaped Star Pattern (Java)

A Java console program that prints an "E"-like star (`*`) pattern of size `a x a`, where `a` is taken as user input.

## How it works
- Takes an integer `a` from the user (grid size).
- Loops through rows (`i`) and columns (`j`) from `0` to `a-1`.
- Prints `*` on a cell when it satisfies one of these conditions:
  - `j == 0` — the left border (first column of every row)
  - `i == 0 && j != a-1` — the top border, excluding the last column
  - `j == a-1 && i != 0 && i != a/2` — the right border, excluding the top row and the middle row
  - `i == a/2 && j != a-1` — the middle row, excluding the last column
- Otherwise, prints blank spaces.

Together these form a left border, a top border, a middle horizontal line, and a right border with gaps at the top and middle — giving the overall look of the letter "E" (mirrored/reversed depending on how the right border connects).

## Run it

```bash
javac Rstr.java
java Star.Rstr
```

Enter a value for `a` (grid size) when prompted.

## Example

Input:
```
8
```

Output: a boxed shape with a left wall, top wall, middle horizontal line, and a right wall broken at the top and middle rows — resembling the letter "E".