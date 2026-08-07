class Solution {
    public int reverseBits(int x) {

        StringBuilder binary = new StringBuilder(
            String.format("%32s", Integer.toBinaryString(x))
                    .replace(' ', '0')
        );

        int[] binaryarr = binary.chars().toArray();

        int i = 0;
        int j = binaryarr.length - 1;

        while (i < j) {
            int temp = binaryarr[i];
            binaryarr[i] = binaryarr[j];
            binaryarr[j] = temp;

            i++;
            j--;
        }

        StringBuilder revBinary = new StringBuilder();

        for (int k = 0; k < binaryarr.length; k++) {
            revBinary.append((char) binaryarr[k]);
        }

        return (int) Long.parseLong(revBinary.toString(), 2);
    }
}