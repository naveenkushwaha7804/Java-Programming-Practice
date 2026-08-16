# Space to Upper (Capitalize Each Word)

A Java program that takes a sentence as input, prints each word on a new line 
(splitting on spaces), and capitalizes the first letter of every word.

## Package
`String`

## How It Works
- Reads a full line of input using `Scanner`.
- Iterates character by character through the string.
- If the current character is a space, moves to a new line (`System.out.println()`).
- If it's the first character of the string, or the character right after a space, 
  it's converted to uppercase using `Character.toUpperCase()`.
- All other characters are printed as-is.

## Example

**Input:**