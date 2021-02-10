package a_primeros_pasos;

import java.util.Random;  //The rule for package names is that they are
                          // mostly letters or numbers separated by dots
import java.util.*;   // import all the classes in a Package, it doesn,t slows the program
					 //  but listing the classes make the code more easy to read

// java.lang it,s automatically imported , jva.util.Random it,s redundant
// you can only have a wildcard(comodin) and must be at the end
// you can,t import methods, only classes

/*
 * for example to use Paths and Files from java.nio.file you can use:
 * 	impot java.nio.file.*;
 * 	import java.nio.file.Files;
 * 	impor java.nio.file.Paths;
 * but you can,t use:
 * 	import java.nio.*;     only classes
 * 	import jva.nio.*.*;    only one wildcard
 * 	impor java.nio.files.Paths.*;  only classes
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
