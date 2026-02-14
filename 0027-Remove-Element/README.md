# 27. Remove Element

## 🧩 Problem Statement
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place.

Return the number of elements in `nums` that are not equal to `val`.

The order of elements may be changed.

---

## 🔍 Example

**Input:**  
nums = [3,2,2,3], val = 3  

**Output:**  
2  

Explanation:  
After removing 3, the array becomes [2,2].

---

## 💡 Approach (Two Pointer Technique)

This solution uses a two-pointer method:

1. Initialize a pointer `k = 0`.
2. Traverse the array using index `i`.
3. If `nums[i] != val`:
   - Copy it to position `k`.
   - Increment `k`.
4. Return `k` as the new length.

This modifies the array in-place without using extra space.

---
    }
}
