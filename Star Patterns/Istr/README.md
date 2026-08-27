# Star Pattern - Letter I

Java program jo user se size `n` leta hai aur stars (`*`) ka use karke
letter **"I"** shape print karta hai.

## Pattern Logic
- Top row → poori row stars (i==0)
- Bottom row → poori row stars (i==a-1)
- Middle column → hamesha stars (j==a/2)
- Baaki sab jagah blank space

## How to Run
\`\`\`bash
javac Istr.java
java Star.Istr
\`\`\`

## Sample Input/Output
Input:
\`\`\`
5
\`\`\`

Output:
\`\`\`
* * * * *
    *    
    *    
    *    
* * * * *
\`\`\`