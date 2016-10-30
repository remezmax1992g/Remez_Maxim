package by.pvt.homework.classes;

import java.util.Random;

class TestingSimpleFraction 
{

	public static void main(String[] args) {
		Random r = new Random();
		int[][] a = new int[2][5];
		for (int i = 0; i < 2; i++ )
		{
			for (int j = 0; j < a[i].length; j++)
			{
				int b = r.nextInt(10);
				if (b == 0)
				{
				a[i][j] = b + 1;
				}
				else
				{
				a[i][j] = b;
				}
			}
		}
		SimpleFraction.printfraction(a);
		int c = SimpleFraction.generalzn(a);
		System.out.println("Общий знаменатель: " + c);
		SimpleFraction.sum(a);
		SimpleFraction.deduction(a);

	}
}
	public class SimpleFraction{
		public static int[][] sum(int[][] array)
		{
			int summa = 0;
			for (int i = 0; i < array[0].length; i++)
			{
				int ch = array[0][i] * generalzn(array)/array[1][i];
			summa += ch;
			}
			int[][] newfraction = new int[2][1];
			newfraction[0][0] = summa;
			newfraction[1][0] = generalzn(array);
			printfraction(newfraction);
			int[][]fraction1 = sokr(newfraction);
			return fraction1;
		}
			public static int[][] deduction(int[][] array)
			{
				int deduc = 0;
				for (int i = 0; i < array[0].length - 1; i++)
				{
					int ch = array[0][i + 1] * generalzn(array)/array[1][i];
				deduc =  array[0][0] * generalzn(array)/array[1][0] - ch;
				}
				int[][] newfraction = new int[2][1];
				newfraction[0][0] = deduc;
				newfraction[1][0] = generalzn(array);
				printfraction(newfraction);
				int[][]fraction1 = sokr(newfraction);
				return fraction1;
			}
		public static int generalzn(int[][] array)
		{
			int zn = 1;
			for (int i = 0; i < array[1].length; i++)
			{
				zn = zn * array[1][i];
			}
			return zn;
		}
		public static void printfraction(int[][] array)
		{
			for (int i = 0; i < array[1].length; i++)
			{
				System.out.print(array[0][i] + "/" + array[1][i] + " ");
			}
			System.out.println();
		}
		public static int[][] sokr(int[][] array){
			int nod;
			if (Math.abs(array[0][0]) > Math.abs(array[1][0]))
			{
				nod = Math.abs(array[1][0]);
			}
			else
			{
				nod = Math.abs(array[0][0]);;
			}
			while (nod > 1)
			{
				if ((array[0][0] % nod == 0) && (array[1][0] % nod == 0))
				{
					break;
				}
				nod--;
			}
			int ch = array[0][0]/nod;
			int zn = array[1][0]/nod;
			int[][] newarray = new int[2][1];
			newarray[0][0] = ch;
			newarray[1][0] = zn;
			System.out.print("Сокращённый вариант дроби: ");
			printfraction(newarray);
			return newarray;
		}
	}
