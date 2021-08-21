package writingToAFile;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Demonstrates how to use class PrintWriter to print times tables to a file. 
 * 
 * @author Brittany Pruneau 
 *
 */
public class TimeTable
{
	public static void main(String[] args)
	{
		String fileTimeTables = "src/writingToAFile/TimeTables.txt";
		extracted(fileTimeTables);
	}

	/*
	 * Uses PrintWriter class to print times tables to a file called TimeTables. 
	 */
	public static void extracted(String fileTimeTables)
	{
		try (PrintWriter writer = new PrintWriter(new File(fileTimeTables)))
		{
			for (int i = 1; i < 11; i++)
			{
				for (int j = 1; j <= 10; j++)
				{
					writer.printf("%2d * %-2d = %-2d", j, i, (i * j));
					writer.printf("%10d * %d = %d\n", j, i + 1, ((i + 1) * j));
					
					writer.checkError(); 
				}
				i++;
				
				writer.println();
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
