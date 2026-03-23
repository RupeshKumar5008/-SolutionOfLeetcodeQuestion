class Solution {
    public String getEncryptedString(String s, int k) {
    int n = s.length();
    // k = k - n;
    k = k % n;     
        k = n - k;    
    char[] arr = s.toCharArray();
    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
    // reverse(arr, 0, n - 1);

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
