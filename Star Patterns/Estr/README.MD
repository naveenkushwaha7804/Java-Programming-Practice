# Star Pattern - Letter F (class named Estr)

Java program jo user se size `n` leta hai aur stars (`*`) ka use karke
letter **"F"** shape print karta hai (top bar + middle bar + left column).

> ⚠️ Note: class ka naam `Estr` hai lekin output actually letter **F** produce
> karta hai, kyunki bottom row ki koi condition nahi hai. Agar E chahiye,
> `i == a-1` wali condition bhi add karni hogi.

## Pattern Logic
- Top row → poori row stars (i==0)
- Middle row → poori row stars (i==a/2-1), lekin **hardcoded `j<=4`** use ho raha hai — bade `n` ke liye galat result de sakta hai, `j<=a-1` use karna better hai
- Left column → hamesha stars (j==0)
- Bottom row → **missing** (isi wajah se F ban raha hai, E nahi)

## How to Run
\`\`\`bash
javac Estr.java
java Star.Estr
\`\`\`

## Sample Input/Output
Input:
\`\`\`
5
\`\`\`

Output:
\`\`\`
* * * * * 
* * * * * 
*         

*         
*         
\`\`\`

## Known Issue
- `j<=4` hardcoded value ko `j<=a-1` se replace karo taaki yeh kisi bhi `n` size ke liye sahi chale.
- Agar letter **E** banana hai (F nahi), toh condition mein `|| i==a-1` add karo.