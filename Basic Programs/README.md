# Steel Grade Calculator

## Overview

This Java program determines the grade of steel based on three material properties:

- Hardness
- Carbon Content
- Tensile Strength

The program evaluates the given values using conditional statements and assigns the appropriate steel grade according to predefined rules.

---

## Problem Statement

A steel manufacturer grades steel based on the following conditions:

- Hardness > 50
- Carbon Content < 0.7
- Tensile Strength > 5600

The grade is assigned depending on how many conditions are satisfied.

| Conditions Satisfied | Grade |
|----------------------|-------|
| All three            | 10    |
| Hardness & Carbon    | 9     |
| Carbon & Tensile     | 8     |
| Hardness & Tensile   | 7     |
| Any one condition    | 6     |
| None                 | 5     |

---

## Technologies Used

- Java
- Scanner Class
- Conditional Statements (`if-else`)

---

## Sample Input

```
Hardness: 60
Carbon: 0.5
Tensile Strength: 6000
```

## Output

```
Grade 10
```

---

## Concepts Practiced

- User Input
- Decision Making
- Logical Operators (`&&`, `||`)
- Nested Conditional Logic

---

## Learning Outcome

This program demonstrates how multiple conditions can be evaluated using logical operators to make decisions and classify data based on predefined rules.

---

## Author

**Naveen Kushwaha**