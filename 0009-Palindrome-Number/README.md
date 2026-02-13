# 9. Palindrome Number

## 🧩 Problem Statement
Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## 🔍 Example

**Input:**  
x = 121  

**Output:**  
true  

**Input:**  
x = -121  

**Output:**  
false  

---

## 💡 Approach (Using For Loop to Reverse Number)

In this solution:

1. If the number is negative, return `false` immediately.
2. Store the original number.
3. Use a `for` loop to reverse the digits:
   - Extract last digit using `% 10`
   - Build reversed number using:
     ```
     palin = palin * 10 + digit
     ```
4. After reversing, compare:
   - If `x == palin` → return `true`
   - Otherwise → return `false`

---

## 🧠 Code Explanation

```java
class Solution {
    public boolean isPalindrome(int x) {
        int palin = 0;
        int num = x;

        if (x < 0)
            return false;

        for (int i = x; i > 0; i = i / 10) {
            int d = i % 10;
            palin = palin * 10 + d;
        }

        if (x == palin)
            return true;
        else
            return false;
    }
}
