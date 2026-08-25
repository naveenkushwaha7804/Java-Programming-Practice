# Star Pattern - Letter B

Java program jo user se size `n` leta hai aur stars (`*`) ka use karke
letter **"B"** shape print karta hai.

## Pattern Logic
- Top row → poori row stars (last col chhod ke)
- Bottom row → poori row stars (last col chhod ke)
- Middle row (n/2) → poori row stars (last col chhod ke)
- Left column → hamesha stars
- Right column → sirf un rows mein jo top, bottom, ya middle nahi hain (isse do closed loops ban jaate hain, jo B ka shape deta hai)

## How to Run
\`\`\`bash
javac Bstr.java
java Star.Bstr
\`\`\`

## Sample Input/Output
Input:
\`\`\`
5
\`\`\`

Output:
\`\`\`
* * * * 
*       *
* * * * 
*       *
* * * * 
\`\`\`