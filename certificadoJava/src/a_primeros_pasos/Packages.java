package a_primeros_pasos;
// it's important to use packages name instead the default package in order to avoid 
// conflict classes names

import java.util.Random;  //The rule for package names is that they are
                          // mostly letters or numbers separated by dots
import java.util.*;   // import all the classes in a Package, it doesn't slows the program
					 //  but listing the classes make the code more easy to read


// java.lang it,s automatically imported , java.util.Random it,s redundant
// you can only have a wildcard(comodin) and must be at the end
// you can,t import methods, only classes

/*
 * for example to use Paths and Files from java.nio.file you can use:
 * 	import java.nio.file.*;
 * 	import java.nio.file.Files;
 * 	import java.nio.file.Paths;
 * but you can,t use:
 * 	import java.nio.*;     only classes
 * 	import java.nio.*.*;    only one wildcard
 * 	import java.nio.files.Paths.*;  only classes
 */	

public class Packages {
	
	// Java put classes in packages, are logical grouping for classes
	// import statements tells java where to look in for classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(); // DOES NOT COMPILE if we don't  import the package
		System.out.println(r.nextInt(10)); // print a number between 0 and 9

	}

}

/*
 * one of the reasons of using packages is so that classes names don't have to be unique across java
 * you can find a class that can be found in multiple places , for example Date class
 * java.util.Date  and  java.sql.Date
 * sometimes you have to import classes from packages that have the same name class
 * import java.util.*;
 *  import.java.sql.*; // if we use Date from java.util in our code this wouln't compile
 *  the solution is explicit import of the class name
 *  import java.util.Date have preference over wildcards 
 *  
 *  And in the case we have two explicit import we have to use one with import an other with 
 *  fully qualified class name
 *  example 
 *  import java.util.Date 
 *   public class Conflicts {
 *  				Date date;     // this will take the java.util.Date
 *  				java.sql.Date sqlDate;
 *  }
 */

// ***************USING CONSOLE INSTEAD THE IDE***************

/*
 * We will work whit console instead the IDE, we'll create two package A and B, with two java files 
 * ClassA  and  ClassB
 * 
 * Suppose we have these two classes:
C:\temp\packagea\ClassA.java   (linux  /tmp/packagea/ClassA.java)
	package packagea;
		public class ClassA {
		}
C:\temp\packageb\ClassB.java   (linux  /tmp/packageb/ClassB.java)
	package packageb;
	import packagea.ClassA;
		public class ClassB {
		public static void main(String[] args) {
			ClassA a;
			System.out.println("Got it");
			}
		}
 * now wi have to move to temp folder C:\temp   or C /tmp
 * 
 * to compile:
 * 			javac packagea/ClassA.java packageb/ClassB.java
 * 
 * this would create  two new files ClassA.class and ClassB.class
 * 
 * to run :
 * 	  		java packageb.ClassB
 * 
 *If it works we'll see "got it" printed
 *
 ****************************SEE MORE ABOUT CLASSPATH AND JARS******************
 */

/*Code Formatting on the Exam
Not all questions will include the imports. If the exam isn’t asking about imports in the
question, it will often omit the imports to save space. You’ll see examples with line numbers
that don’t begin with 1 in this case. The question is telling you, “Don’t worry—imagine
the code we omitted is correct; just focus on what I’m giving you.” This means when you
do see the line number 1 or no line numbers at all, you have to make sure imports aren’t
missing. Another thing the exam does to save space is to merge code on the same line. You
should expect to see code like the following and to be asked whether it compiles. (You’ll
learn about ArrayList in Chapter 3—assume that part is good for now.)
6: public void method(ArrayList list) {
7: if (list.isEmpty()) { System.out.println("e");
8: } else { System.out.println("n");
9: } }
The answer here is that it does compile because the code starts below the imports. Now,
what about this one? Does it compile?
1: public class LineNumbers {
2: public void method(ArrayList list) {
3: if (list.isEmpty()) { System.out.println("e");
4: } else { System.out.println("n");
5: } } }
For this one, you would answer “Does not compile.” Since the code begins with line 1,
you don’t get to assume that valid imports were provided earlier. The exam will let
you know what package classes are in unless they’re covered in the objectives. You’ll
be expected to know that ArrayList is in java.util —at least you will once you get to
Chapter 3 of this book!
You’ll also see code that doesn’t have a main() method. When this happens, assume
the main() method, class definition, and all necessary imports are present. You’re just
being asked
 */


