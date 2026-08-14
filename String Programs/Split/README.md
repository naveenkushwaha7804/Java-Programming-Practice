# 🔠 Capitalize First & Last Letter of Each Word (Java)

> A Java program that capitalizes the first and last letter of every word in a sentence, while keeping the middle letters unchanged.

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/Concept-Strings%20%7C%20Arrays-blue)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)

---

## 📋 Description

This program takes a sentence as input, splits it into words, and for each word capitalizes only the **first** and **last** character — leaving everything in between exactly as it was typed.

---

## ⚙️ How It Works

1. User enters a string (sentence)
2. `split(" ")` breaks the sentence into a `String[]` array of words
3. For each word:
   - If the word has **only 1 character**, it's simply converted to uppercase using `.toUpperCase()`
   - Otherwise, the **first character** is capitalized using `Character.toUpperCase(arr[i].charAt(0))`, the **middle part** is kept as-is using `substring(1, length - 1)`, and the **last character** is capitalized using `Character.toUpperCase(arr[i].charAt(length - 1))` — all three pieces are concatenated together
4. Each processed word is printed on its own line

---

## 🧑‍💻 Code

```java
package String;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String S1;
            if (arr[i].length() == 1) {
                S1 = arr[i].toUpperCase();
            } else {
                S1 = Character.toUpperCase(arr[i].charAt(0)) +
                        arr[i].substring(1, arr[i].length() - 1) +
                        Character.toUpperCase(arr[i].charAt(arr[i].length() - 1));
            }
            System.out.println(S1);
        }
    }
}
```

---

## ▶️ How to Run

```bash
javac Split.java
java String.Split
```

**Sample Run:**
```
Input: naveen kushwaha java
NaveeN
KushwahA
JavA
```

---

## 🔑 Key Concepts Practiced

- Splitting a string into words using `split(" ")`
- Extracting characters using `charAt()`
- Extracting a middle substring using `substring(start, end)`
- Handling an edge case separately (single-character words) to avoid `substring` index errors

---

## 🚀 Possible Improvements

- Handle multiple spaces or empty words gracefully using `split("\\s+")`
- Use `StringBuilder` instead of `String` concatenation for slightly better performance
- Add a check for empty string words (`arr[i].length() == 0`) to prevent potential `StringIndexOutOfBoundsException`