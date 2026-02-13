# 13. Roman to Integer

## 🧩 Problem Statement
Given a Roman numeral string `s`, convert it to an integer.

Roman numerals are represented by seven different symbols:

| Symbol | Value |
|--------|--------|
| I      | 1      |
| V      | 5      |
| X      | 10     |
| L      | 50     |
| C      | 100    |
| D      | 500    |
| M      | 1000   |

---

## 🔍 Example

**Input:**  
s = "III"  

**Output:**  
3  

**Input:**  
s = "IV"  

**Output:**  
4  

**Input:**  
s = "MCMXCIV"  

**Output:**  
1994  

---

## 💡 Approach (Using Integer Array Mapping)

### Step 1: Convert Characters to Values
- Create an integer array of same length as string.
- Store numeric value of each Roman character.

### Step 2: Apply Roman Subtraction Rule
- Traverse array from left to right.
- If current value is smaller than next value:
  - Subtract it.
- Otherwise:
  - Add it.

### Step 3: Add Last Element
- Always add the last value to the sum.

---
