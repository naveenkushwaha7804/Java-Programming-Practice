
# Star Pattern - Letter M

Java program jo user se size `n` leta hai aur stars (`*`) ka use karke
letter **"M"** shape print karta hai.

## Pattern Logic
- Left column → hamesha stars (j==0)
- Right column → hamesha stars (j==a-1)
- Left diagonal → `i==j`, sirf upar aadhe rows tak (i<=a/2) — top-left se beech tak jaata hai
- Right diagonal → `i+j==a-1`, sirf upar aadhe rows tak (i<=a/2) — top-right se beech tak jaata hai
- Dono diagonals beech mein mil kar M ka "V" wala center banate hain

## How to Run
\`\`\`bash
javac Mstr.java
java Star.Mstr
\`\`\`

## Sample Input/Output
Input:
\`\`\`
7
\`\`\`

Output:
\`\`\`
*     *
* *  *
* * * *
*     *
*     *
*     *
*     *
\`\`\`