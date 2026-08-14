# 🔀 Reverse Word Order in a String (Java)

> A simple Java program that reverses the order of words in a sentence using `split()`.

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/Concept-Strings%20%7C%20Arrays-blue)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)

---

## 📋 Description

This program takes a sentence as input, splits it into individual words, and prints those words back in **reverse order** (not reversing the characters — reversing the sequence of words).

---

## ⚙️ How It Works

1. User enters a string (sentence)
2. `split(" ")` breaks the string into a `String[]` array of words, using space as the delimiter
3. Loop through the array **from the last index to the first**
4. Append each word to a result string, building the reversed-order sentence
5. Print the final reversed string

---

## 🧑‍💻 Code

```java
package String;

import java.util.Scanner;

public class SplitStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String reversedStr = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedStr += arr[i] + " ";
        }

        System.out.println(reversedStr);
    }
}
```

---

## ▶️ How to Run

```bash
javac SplitStr.java
java String.SplitStr
```

**Sample Run:**
```
enter the string
naveen kushwaha loves java
java loves kushwaha naveen 
```

---

## 🔑 Key Concepts Practiced

- Splitting a string into an array using `split(" ")`
- Iterating an array in **reverse order** using a `for` loop
- String concatenation inside a loop
- Building a new string from array elements

---

## 🚀 Possible Improvements

- Use `StringBuilder` instead of `+=` for string concatenation — much more efficient in loops since `String` is immutable in Java
- Trim the trailing extra space at the end of `reversedStr` using `.trim()`
- Handle multiple consecutive spaces in input using `split("\\s+")` instead of `split(" ")`