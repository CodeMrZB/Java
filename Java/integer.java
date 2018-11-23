public class integer
{
	public static void main(String[] args)
	{
		int i = 5;
		int i_byte = Integer.BYTES;
		System.out.println("i_byte:" + i_byte);
		int i_size = Integer.SIZE;
		System.out.println("i_size:" + i_size);
		int i_min_value = Integer.MIN_VALUE;
		System.out.println("i_min_value:" + i_min_value);
		int i_max_value = Integer.MAX_VALUE;
		System.out.println("i_max_value:" + i_max_value);
		Class i_type = Integer.TYPE;
		System.out.println("i_type:" + i_type);

		int i_bitCount = Integer.bitCount(i);
		System.out.println("i_bitCount:" + i_bitCount);

		System.out.println(Integer.compare(1, 2));
	}
}