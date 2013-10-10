public class Eight
{
	//The idea is to make the target parent (like "abcde") become parent+parent (like "abcedabced") so the potential child will be absolutely a child of this sentence if it is actually a rotated version of the original sentence.

	public static boolean check(String a, String b)
	{
		String aa = a+a;
		if(String.isSubstring(aa, b))
			return true;
		return false;
	}
}