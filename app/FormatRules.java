/**
 * @file: Formatter.php
 * 
 * @utor: Moisés Alcocer, 2016
 */

package app;


public class FormatRules {
	
	public static final String[][] RULES = {
		{
			"=", " = "
		},
                //Preserve indent
		{
                    "    ", "@@@@"
		},
		//Deletes double spaces
		{
			"  ", " "
		},
		{
			"==", " == "
		},
		{
			"!=", " != "
		},
		{
			"!", "! "
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
			"( )", "()"
		},
		{
			"())", "( ))"
		},
		{
			"){", ") {"
		},
		{
			"	 )", "	)"
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
			"}catch", "} catch"
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
			"<", " < "
		},
                 {
			">", " > "
		},
		{
			",", ", "
		},
		{
			"->", " -> "
		},
		{
			"}//", "} //"
		},
		{
			"}/*", "} /* "
		},

		//Deletes double spaces
		{
			"  ", " "
		},

		//Deletes spaces in the end of the line
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
		},
		{
			"( ).", "()."
		},
		{
			"( ) ]", "() ]"
		},

		//Restores type conversions
                {
			"( double )", "(double)"
		},
		{
			"( float )", "(float)"
		},
                {
			"( int )", "(int)"
		},
                {
			"( String )", "(String)"
		},
                
                //Restores common groups
                {
			") )", "))"
		},
		{
			"( (", "(("
		},
                {
			"= =", "=="
		},
                {
			"> =", ">="
		},
                {
			"< =", "<="
		},
                {
			"! =", "!="
		},
		{
			"/ *", "/*"
		},
		{
			"* /", "*/"
		},
		{
			"* *", "**"
		},
                {
			"+ +", "++"
		},
                {
			"- -", "--"
		},
                
                //Restore indent
		{
                    "@@@@", "    "
		},
	}; /**/

	public static final String xxx = "xxx";
} //class