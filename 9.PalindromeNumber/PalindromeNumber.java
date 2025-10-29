//My solution on how I would solve this on Oct 29, 2025

class Solution {
    public boolean isPalindrome(int x) {
        // If negative then we know its not a palindrome
        if (x < 0) {
            return false;
        }

        int numPlaces = 0;
        int temp = x;


        while (temp != 0) {
            temp /= 10;
            numPlaces++;
        }

        // Copy individual numbers into array
        int numArray[] = new int[numPlaces];
        for (int i = 0; i < numPlaces; i++) {
            numArray[i] = x % 10;
            x /= 10;
        }


        // Check to see if it reads same forwards and backwards
        int n = numArray.length - 1;
        for(int i = 0, j = n; i < n; i++, j--){
            if (numArray[i] != numArray[j]) {
                return false;
            }
        }
        return true;
    }
}