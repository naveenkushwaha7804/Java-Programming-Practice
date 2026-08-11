# 🔄 Case Swapper — Upper to Lower & Lower to Upper (Java)

> A simple Java program that swaps the case of every letter in a string — uppercase becomes lowercase, and lowercase becomes uppercase.

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/Concept-Strings%20%7C%20Char%20Arrays-blue)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)

---

## 📋 Description

This program takes a string as input, converts it into a character array, and toggles the case of every alphabetic character — uppercase letters become lowercase, and lowercase letters become uppercase. Non-alphabetic characters (numbers, symbols, spaces) are left unchanged.

---

## ⚙️ How It Works

1. User enters a string
2. The string is converted into a `char[]` array using `toCharArray()`
3. Loop through each character:
   - If it's uppercase → convert to lowercase using `Character.toLowerCase()`
   - Else if it's lowercase → convert to uppercase using `Character.toUpperCase()`
4. Rebuild the modified character array back into a `String`
5. Print both the original input and the swapped-case output

---

## 🧑‍💻 Code

```java
package String;

import java.util.Scanner;

public class Uppertolower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        System.out.println("Input:" + input);
        String output = new String(chars);
        System.out.println("Output:" + output);
    }
}
```

---

## ▶️ How to Run

```bash
javac Uppertolower.java
java String.Uppertolower
```

**Sample Run:**
```
Input string: Naveen KUSHWAHA
Input:Naveen KUSHWAHA
Output:nAVEEN kushwaha
```

---

## 🔑 Key Concepts Practiced

- Converting a `String` to a `char[]` using `toCharArray()`
- Rebuilding a `String` from a `char[]` using `new String(chars)`
- Using `Character.isUpperCase()` / `isLowerCase()` for character classification
- Using `Character.toLowerCase()` / `toUpperCase()` for case conversion

---

## 🚀 Possible Improvements

- Fix the typo `"Inout:"` → `"Input:"` in the print statement (already corrected in this README's code block)
- Handle `null` or empty string input gracefully
- Compare performance with Java's built-in (non-existent) direct swap-case method by writing it using `StringBuilder` instead of a `char[]`