# Capitalize First and Last Letter of Each Word (Java)

## Problem

Take a sentence from the user and capitalize the **first and last letter of every word**.

## Example

Input:

```
Enter a sentence: hello world from java
```

Output:

```
HellO WorlD FroM JavA
```

Single-letter words are capitalized as a whole:

```
Enter a sentence: a big cat
A BiG CaT
```

## Approach

1. Read the sentence and split it into words using `split("\\s+")`, so extra spaces do not create empty words.
2. For each word:
   - If it has only one letter, convert it to upper case.
   - Otherwise, upper-case the first letter, keep the middle part as it is, and upper-case the last letter.
3. Join the words with a single space using `StringBuilder`.

## Complexity

- Time: O(n), where n is the length of the sentence
- Space: O(n) for the result string

## How to Run

```bash
javac CapitalizeFirstLast.java
java CapitalizeFirstLast
```

## Concepts Used

- Methods and return values
- String methods: `split`, `charAt`, `substring`, `trim`
- `Character.toUpperCase`
- `StringBuilder`