/**
 * @file: Main.php
 * 
 * @utor: Moisés Alcocer, 2016
 */

package app;

//imports


/**
 * Class for replace string content according to a rules in an array
 * 
 */
public class StrProcessor {

	/**********************************/
	/*** Properties declaration *******/



	/**********************************/
	/*** Methods declaration **********/

		/**
		 * Construct
		 * 
		 * @param 	str
		 * @param 	rules
		 * @return 	String res
		 */
		public static String run( String str, String[][] rules ) {
			System.out.println( "StrProcessor / run()" );

			int len = rules.length;
			String pair[];

			for ( int i = 0; i < len; i++ ) {

				pair = rules[i];
				str  = str.replace( pair[0], pair[1] ); // str.replace( busqueda, reemplazo );
			}


			return str;
		}

		
	/**********************************/
	/*** Internal classes *************/


} //class