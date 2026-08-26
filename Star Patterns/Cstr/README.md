# Star Pattern - Letter C

Java program jo user se size `n` leta hai aur stars (`*`) ka use karke
letter **"C"** shape print karta hai.

## Pattern Logic
- Top row → stars, pehla column chhod ke (i==0 && j!=0)
- Bottom row → stars, pehla column chhod ke (i==a-1 && j!=0)
- Left column → sirf middle rows mein stars (j==0 && i!=0 && i!=a-1)
- Baaki sab jagah blank space

## How to Run
\`\`\`bash
javac Cstr.java
java Star.Cstr
\`\`\`

## Sample Input/Output
Input:
\`\`\`
5
\`\`\`

Output:
\`\`\`
   *  *  *  *  
*        
*        
*        
   *  *  *  *  
\`\`\`