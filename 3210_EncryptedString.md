# 🧠 Problem: Encrypted String
LeetCode No: 3210

---

## ✍️ My Rough Work

### Page 1
![Notes1](Strings/3210_EncryptedString/Strings/3210_EncryptedString/WhatsApp Image 2026-03-23 at 15.51.11.jpeg → 3210_EncryptedString_Notes2.jpg)

### Page 2
![Notes2](Strings/3210_EncryptedString/Strings/3210_EncryptedString/WhatsApp Image 2026-03-23 at 15.50.40.jpeg → 3210_EncryptedString_Notes1.jpg)

---

## 💡 My Approach

- Converted string into character array
- Used reverse method for rotation

Steps:
1. Reverse whole array
2. Reverse first k elements
3. Reverse remaining elements

Used:
k = k % n  
k = n - k  

---

## ⏱ Complexity

- Time: O(n)
- Space: O(1)

---

## 💻 Code

```java
class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k = k % n;
        k = n - k;

        char[] arr = s.toCharArray();

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return new String(arr); 
    }

    void reverse(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
