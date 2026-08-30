class Solution {
     boolean pythagoreanTriplet(int[] arr) {
         int maxElem = 0;
         for (int num : arr) {
             if (num > maxElem) {
                 maxElem = num;
             }
         }

         int[] freq = new int[maxElem + 1];
         for (int num : arr) {
             freq[num]++;
         }

         for (int i = 1; i <= maxElem; i++) {
             if (freq[i] == 0) continue;

             for (int j = i; j <= maxElem; j++) {
                 if (freq[j] == 0 || (i == j && freq[i] < 2)) continue;

                 long cSquare = (long) i * i + (long) j * j;
                 int c = (int) Math.sqrt(cSquare);

                 if ((long) c * c == cSquare && c <= maxElem) {
                     if (freq[c] > 0) {
                         return true;
                     }
                 }
             }
         }
         return false;
     }
 }
