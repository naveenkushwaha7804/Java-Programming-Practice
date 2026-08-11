# 🧮 Calculator using Switch-Case (Java)

> A simple command-line calculator built in Java that performs basic arithmetic operations using the `switch-case` control structure.

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/Concept-Switch--Case-blue)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)

---

## 📋 Description

This program takes two numbers and an operator as input from the user, then uses a `switch-case` statement to decide which arithmetic operation to perform — addition, subtraction, multiplication, or division.

---

## ⚙️ How It Works

1. User enters value of `a` (float)
2. User enters value of `b` (float)
3. User enters an `operator` (`+`, `-`, `*`, `/`)
4. Based on the operator, the corresponding `case` block executes and prints the result
5. If an invalid operator is entered, the `default` case prints `"wrong input"`

---

## 🧑‍💻 Code

```java
import java.util.Scanner;

class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");
        float a = sc.nextFloat();

        System.out.println("enter the value of b");
        float b = sc.nextFloat();

        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
```

---

## ▶️ How to Run

```bash
javac CalculatorSwitchCase.java
java CalculatorSwitchCase
```

**Sample Run:**
```
enter the value of a
10
enter the value of b
5
enter the operator
+
15.0
```

---

## 🔑 Key Concepts Practiced

- Taking user input using `Scanner`
- Using `switch-case` for multi-way branching
- Handling `char` comparisons in `switch`
- Default case for invalid/unexpected input

---

## 🚀 Possible Improvements

- Add input validation for division by zero (`b == 0`)
- Loop the calculator so multiple calculations can be done without restarting
- Add more operators like `%` (modulus) or `^` (power)