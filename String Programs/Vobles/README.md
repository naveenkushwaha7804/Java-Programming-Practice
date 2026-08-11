# 🔤 Vowel, Consonant & Space Counter (Java)

> A simple Java program that reads a string and counts the number of vowels, consonants, and spaces present in it.

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/Concept-Strings%20%7C%20Loops-blue)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)

---

## 📋 Description

This program takes a sentence/string as input from the user and iterates through each character to classify it as a **vowel**, a **consonant**, or a **space**, keeping a running count of each.

---

## ⚙️ How It Works

1. User enters a string (converted to lowercase for uniform comparison)
2. Loop through each character of the string using `charAt(i)`
3. If the character is `a, e, i, o, u` → increment vowel count
4. If the character is a space (`' '`) → increment space count
5. Otherwise → increment consonant count
6. Print the final vowel and consonant counts

---

## 🧑‍💻 Code

```java
package String;

import java.util.Scanner;

public class Vobles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int vobles = 0;
        int consonent = 0;
        int Space = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vobles++;
            } else if (s.charAt(i) == ' ')
                Space++;
            else
                consonent++;
        }

        System.out.println("vobles:" + vobles);
        System.out.println("consonent:" + consonent);
    }
}
```

---

## ▶️ How to Run

```bash
javac Vobles.java
java String.Vobles
```

**Sample Run:**
```
Input: naveen kushwaha
vobles:6
consonent:9
```

---

## 🔑 Key Concepts Practiced

- Reading full-line string input using `Scanner.nextLine()`
- Iterating through a string character-by-character with `charAt()`
- Multi-condition `if-else if-else` logic
- Case-insensitive comparison using `.toLowerCase()`

---

## 🚀 Possible Improvements

- Print the space count as well (currently calculated but not displayed)
- Handle uppercase vowels directly without relying only on `toLowerCase()`
- Ignore/handle special characters and digits separately instead of counting them as consonants
- Use a `switch` statement instead of multiple `if-else` for vowel checking