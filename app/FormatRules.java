/**
 * @file: Formatter.php
 * 
 * @utor: Moisés Alcocer, 2016
 */

package app;


public class FormatRules {
	
	public static final String[][] RULES = {
		{
			"==", " == "
		},
		{
			"!=", " != "
		},
		{
			"(", "( "
		},
		{
			")", " )"
		},
		{
			"(  ", "( "
		},
		{
			"  )", " )"
		},
		{
			") )", "))"
		},
		{
			"( (", "(("
		},
		{
			"()))", "( )))"
		},
		{
			"){", ") {"
		},
		{
			"if(", "if ("
		},
		{
			"for(", "for ("
		},
		{
			"swich(", "swich ("
		},
		{
			"while(", "while ("
		},
		{
			"}else", "} else"
		},
		{
			"{", " {"
		},
		{
			"+", " + "
		},
		{
			"*", " * "
		},
		{
			",", ", "
		},
		{
			"->", " -> "
		},
		{
			"- ->", "--> "
		},
		{
			"}//", "} //"
		},
		{
			"}/*", "} /* "
		},

		//Delete double spaces
		{
			"  ", " "
		},

		//Delete spaces in the end of the line
		{
			"{ ", "{"
		},
		{
			"; ", ";"
		},
		{
			" ;", ";"
		},
		{
			"( );", "();"
		}
	}; /**/

	public static final String xxx = "xxx";
} //class