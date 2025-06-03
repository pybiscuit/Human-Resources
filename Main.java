import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition. Engine is an Attribute of Car.

Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance. Red is a sub-class of Color.

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance. Shirt is a sub-class of Clothing.

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance. Desk is a sub-class of Furniture.

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition. Battery is an attribute of CellPhone.

*/

public class Main 
{
	public static void main(String[] args) 
	{
		File inputFile = new File(args[0]);
		char skipFirstRow = 'Y';
		Person newPerson = new Person("Marcus", 72, 111);
		PersonSet listOfPeople = new PersonSet();
		try {
			Scanner scnr = new Scanner(inputFile);
			while (scnr.hasNextLine()) {
				if (skipFirstRow == 'Y') {
                    skipFirstRow = 'N';
					scnr.nextLine();
                    continue;
                }

				String name = scnr.next();
				double height = scnr.nextDouble();
				double weight = scnr.nextDouble();
				
				Person tmpPerson = new Person(name, height, weight);
				listOfPeople.add(tmpPerson);
				//if (scnr.hasNextLine()) scnr.nextLine();
			}
			scnr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.print(listOfPeople);		
	}
}
