package week_2;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        String binaryString = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        StringBuilder flippedBinaryString = new StringBuilder();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                flippedBinaryString.append("1");
            } else {
                flippedBinaryString.append("0");
            }
        }
        return Long.parseUnsignedLong(flippedBinaryString.toString(), 2);
    }
}
