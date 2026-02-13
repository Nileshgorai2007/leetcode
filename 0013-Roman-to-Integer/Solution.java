class Solution {
    public int romanToInt(String s) {

        int l = s.length();
        int sum = 0;
        int[] arr = new int[l];

        
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (ch == 'I') arr[i] = 1;
            else if (ch == 'V') arr[i] = 5;
            else if (ch == 'X') arr[i] = 10;
            else if (ch == 'L') arr[i] = 50;
            else if (ch == 'C') arr[i] = 100;
            else if (ch == 'D') arr[i] = 500;
            else if (ch == 'M') arr[i] = 1000;
        }

        
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] < arr[i + 1])
                sum -= arr[i];
            else
                sum += arr[i];
        }

        
        sum += arr[l - 1];

        return sum;
    }
}
