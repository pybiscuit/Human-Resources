// Name: Robert Vanderburg
// Email: rvanderburg@unm.edu
// Assignment: Main.java (Human Resources)
// Purpose: Human Resource Parts 1 and 2. provide mechanisms for inheritance, 
// inerfaces, polymorphism, and file io.

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
R1: Composition. Car "has-a" engine.

Q2: Color and Red are related
by which, Inheritance or Composition?
R2: Inheritance. Red "is-a" Color.

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
R3: Inheritance. Shirt "is-a" Clothing.

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
R4: Inheritance. Desk "is-a" Furniture.

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
R5: Composition. CellPhone "has-a" Battery.

*/

public class Main 
{
	public static void main(String[] args) 
	{

		// open the file passed via command line args.
		File inputFile = new File(args[0]);
		char skipFirstRow = 'Y';
		
		PersonSet listOfPeople = new PersonSet();

		// test person - not used in final version, requested in pt. 1
		// Person newPerson = new Person("Marcus", 72, 111);

		try {
			// open a scanner to read the file. try-catch for ioexceptions.
			Scanner scnr = new Scanner(inputFile);

			// loop over scanner nextlines (skipping the first for column headers)
			// extracting name, height, wegiht.
			// add the person data to the list of people.
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
			}

			scnr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
			
		System.out.print(listOfPeople);		
	}
}
