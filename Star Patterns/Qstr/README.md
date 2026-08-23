# Diagonal Star Pattern (Java)

A Java console program that prints a diagonal-based star (`*`) pattern of size `a x a`, where `a` is taken as user input.

## How it works
- Takes an integer `a` from the user (grid size).
- Loops through rows (`i`) and columns (`j`) from `0` to `a-1`.
- Prints `*` on a cell when it satisfies one of these diagonal conditions:
  - `i + j == 3` — a fixed anti-diagonal near the top
  - `i + j == (i+1)*2 + 1` — one diagonal line
  - `i + j == (j+1)*2 + 1` — another diagonal line
  - `i + j == 9 && i >= a/2` — diagonal in the bottom half
  - `i + j == j*2 && i >= a/2` — another diagonal in the bottom half
- Otherwise, prints blank spaces.

Together these conditions form crossing diagonal lines, creating an X/diamond-like star pattern.

## Run it

```bash
javac Qstr.java
java Star.Qstr
```

Enter a value for `a` (grid size) when prompted.

## Example

Input:
```
10
```

Output: a pattern of crossing diagonal lines made of `*`, forming an X-like shape across the grid.