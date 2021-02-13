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

// ***************repasar uso de consola para ejecutar Java en vez de Ide***************
