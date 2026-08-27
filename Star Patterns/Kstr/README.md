# Star Pattern - Letter K

Java program jo stars (`*`) ka use karke letter **"K"** shape print karta hai.
Grid size **hardcoded 7x7** hai (koi user input nahi liya gaya, previous
programs jaisa Scanner use nahi hua is file mein).

## Pattern Logic
- Left column → hamesha stars (j==0)
- Ek diagonal → `i + j == 3` (upar se neeche jaate hue, middle tak aata hai)
- Doosra diagonal → `i + j == (i-1)*2 - 1` (middle se neeche jaate hue)
- Dono diagonals middle row (i==3) par left edge (j==0) par mil jaate hain — K ka "point" yahi banta hai

## How to Run
\`\`\`bash
javac Kstr.java
java Star.Kstr
\`\`\`

## Sample Output
\`\`\`
*     * 
*   *   
* *     
*       
* *     
*   *   
*     * 
\`\`\`

## Known Limitation
- Size 7 hardcoded hai; agar dynamic size (`n`) chahiye, Scanner add karke
  `a` variable ke through size lena hoga, jaisa baaki letter programs mein hai.