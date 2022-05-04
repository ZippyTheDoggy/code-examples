public class Solution {
	public static boolean isBinary(String bin) {
		return isBinary(bin, 0);
	}
    public static boolean isBinary(String bin, int i) {
		if(i == bin.length() - 1) return (bin.charAt(i) == '0') || (bin.charAt(i) == '1');
        return (bin.charAt(i) == '0' || bin.charAt(i) == '1') && isBinary(bin, i + 1);
    }
}

// isBinary("0110") -> true
// isBinary("1234") -> false
