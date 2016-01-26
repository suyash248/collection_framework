//To sort the array.

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class Arraysort
{
	public static void main(String... w)
	{
		String strings[]={"A","H","J","P","D","W","S"};
		Arrays.sort(strings);
		for(int i=0;i<strings.length;i++)
			System.out.println(strings[i]);
		System.out.println("Sorted");
	}
}

/*  OUTPUT-
A
D
H
J
P
S
W
Sorted  



'sort()' method of "Arrays" class is overloaded-

static void	sort(byte[] a)
Sorts the specified array into ascending numerical order.

static void	sort(byte[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(char[] a)
Sorts the specified array into ascending numerical order.

static void	sort(char[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(double[] a)
Sorts the specified array into ascending numerical order.

static void	sort(double[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(float[] a)
Sorts the specified array into ascending numerical order.

static void	sort(float[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(int[] a)
Sorts the specified array into ascending numerical order.

static void	sort(int[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(long[] a)
Sorts the specified array into ascending numerical order.

static void	sort(long[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static void	sort(java.lang.Object[] a)
Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.

static void	sort(java.lang.Object[] a, int fromIndex, int toIndex)
Sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements.

static void	sort(short[] a)
Sorts the specified array into ascending numerical order.

static void	sort(short[] a, int fromIndex, int toIndex)
Sorts the specified range of the array into ascending order.

static <T> void	sort(T[] a, Comparator<? super T> c)
Sorts the specified array of objects according to the order induced by the specified comparator.

static <T> void	sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.
*/
 