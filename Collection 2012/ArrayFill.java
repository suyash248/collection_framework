//To fill common value in an array.
import java.util.Arrays;
public class ArrayFill
{
	public static void main(String... w)
	{
		double[] data=new double[5];
		Arrays.fill(data,1.0);
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
	}
}

/* OUTPUT-
1.0
1.0
1.0
1.0
1.0





'fill()' is overloaded function of "Arrays" class-

static void	fill(boolean[] a, boolean val)
Assigns the specified boolean value to each element of the specified array of booleans.

static void	fill(boolean[] a, int fromIndex, int toIndex, boolean val)
Assigns the specified boolean value to each element of the specified range of the specified array of booleans.

static void	fill(byte[] a, byte val)
Assigns the specified byte value to each element of the specified array of bytes.

static void	fill(byte[] a, int fromIndex, int toIndex, byte val)
Assigns the specified byte value to each element of the specified range of the specified array of bytes.

static void	fill(char[] a, char val)
Assigns the specified char value to each element of the specified array of chars.

static void	fill(char[] a, int fromIndex, int toIndex, char val)
Assigns the specified char value to each element of the specified range of the specified array of chars.

static void	fill(double[] a, double val)
Assigns the specified double value to each element of the specified array of doubles.

static void	fill(double[] a, int fromIndex, int toIndex, double val)
Assigns the specified double value to each element of the specified range of the specified array of doubles.

static void	fill(float[] a, float val)
Assigns the specified float value to each element of the specified array of floats.

static void	fill(float[] a, int fromIndex, int toIndex, float val)
Assigns the specified float value to each element of the specified range of the specified array of floats.

static void	fill(int[] a, int val)
Assigns the specified int value to each element of the specified array of ints.

static void	fill(int[] a, int fromIndex, int toIndex, int val)
Assigns the specified int value to each element of the specified range of the specified array of ints.

static void	fill(long[] a, int fromIndex, int toIndex, long val)
Assigns the specified long value to each element of the specified range of the specified array of longs.

static void	fill(long[] a, long val)
Assigns the specified long value to each element of the specified array of longs.

static void	fill(java.lang.Object[] a, int fromIndex, int toIndex, java.lang.Object val)
Assigns the specified Object reference to each element of the specified range of the specified array of Objects.

static void	fill(java.lang.Object[] a, java.lang.Object val)
Assigns the specified Object reference to each element of the specified array of Objects.

static void	fill(short[] a, int fromIndex, int toIndex, short val)
Assigns the specified short value to each element of the specified range of the specified array of shorts.

static void	fill(short[] a, short val)
Assigns the specified short value to each element of the specified array of shorts.        */