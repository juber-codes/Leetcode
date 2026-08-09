class Solution {
    public int getDecimalValue(ListNode head) {

        StringBuilder binary = new StringBuilder();

        while (head != null) {

            binary.append(head.val);

            head = head.next;
        }

        int result = bin_int(binary.toString());

        return result;
    }

    public static int bin_int(String binary) {

        int sum = 0;
        int j = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            char ch = binary.charAt(i);

            if (ch == '1') {
                sum = sum + (int) Math.pow(2, j);
            }

            j++;
        }

        return sum;
    }
}