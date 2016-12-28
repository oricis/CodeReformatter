# CodeReformatter
A program to reformat / restructure a text in a plaintext file

This basic aplicacition mades with JavaFx includes a group of rules to reformat a file with code, for example, next script:

	class Xxx {

	 public Xxx(String str) {

	   System.out.println("Hello. You has given me the next text: "+str);
	 }

	}//class

after to be processed will see:

	class Xxx {

	 public Xxx( String str ) {

	   System.out.println( "Hello. You has given me the next text: " + str );
	 }

	} //class

In order to use the program only execute it, select the file to process clicking the button and seek the file in the disk. The application has to work automatically and show a message with the result of the operation.
