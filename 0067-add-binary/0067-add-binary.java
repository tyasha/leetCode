import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
             BigInteger aInt = new BigInteger(a, 2);
        BigInteger bInt = new BigInteger(b, 2);
        return aInt.add(bInt).toString(2);
    }
}