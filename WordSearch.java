
package C210;
	
	import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Please type the cities you would like to use separated by a comma");
	String line = sc.nextLine();
	String[] cities = line.split(",");
	
	System.out.print("Please enter the city you would like to search for");

	String searchCity= sc.nextLine();
	for(int i = 0; i <  cities.length; i++)
	{
	System.out.println(cities[i]);	
	}
	int totalMatches=0;
	for(int i = 0; i < cities.length; i++)
	{
		if (cities[i].contains(searchCity)) 
		{
		System.out.println("Found" + searchCity);
		totalMatches++;
		}
	}

 System.out.println("Total matches= " + totalMatches);

	
	System.out.print(Arrays.toString(cities));
sc.close();
	
	}
}

