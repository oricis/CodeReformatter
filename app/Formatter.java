/**
 * @file: Formatter.php
 * 
 * @utor: Moisés Alcocer, 2016
 * @version: 0.1 - 28.12.2016
 */

package app;

//imports
import java.io.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 * Class to construct the App´s GUI
 * 
 */
public class Formatter extends javafx.application.Application {

	/**********************************/
	/*** Properties declaration *******/

		private File file = null;
		private Stage stage;

		//Root node
		private VBox layout = new VBox();

		//Elements
		private Button btn = new Button( "Seleccionar fichero" );
		private Text feedback = new Text(); //for show the feedbacks with the results
		private Text label    = new Text(); //for show path to selected file
		private Text input    = new Text(); //for show path to selected file
        
        private final String VERSION = "0.1 - 28.12.2016";
                
                
	/**********************************/
	/*** Methods declaration **********/

		/**
		 * Main method
		 *
		 * @param args the command line arguments
		 */
		public static void main( String[] args ) {
			
			launch( args );
		}

		@Override 
		public void start( Stage primaryStage ) {
			System.out.println( "Formatter / start()" );
			this.stage = primaryStage;
			
			setLayout();

			//Adds the escene to stage
			primaryStage.setScene( new Scene( layout, 300, 200 ));

			//Configs the stage
			primaryStage.setTitle( "Formateador código " + VERSION );

			//Shows the stage
			primaryStage.show();
		}

		/**
		 * Process file content
		 * 
		 */
		private void process() {
			System.out.println( "Formatter / process()" );

			FileChooser fileChooser = new FileChooser();
			this.file  = fileChooser.showOpenDialog( stage );

			//Hiddens the button
			btn.setVisible( false );

			//Shows the file path in the GUI
			setPath();

			String str = new Files().getFileContent( this.file );
			System.out.println( "tengo el contenido..." );
			str = StrProcessor.run(
				str,
				FormatRules.RULES
			);

			new Files().setFileContent( str );
			new Feedback().ok();
		}

		/**
		 * Sets the layout (and components) for the App
		 * 
		 */
		private void setLayout() {

			//Configs the layout
			layout.setAlignment( Pos.CENTER );
			layout.setPadding( new Insets( 10, 10, 10, 10 ));
			layout.setSpacing( 8 ); //Vertical spacing between the nodes

			//Configs elements
			feedback.setFont(  
				Font.font( "Tahoma", FontWeight.NORMAL, 15 ) 
			);
			input.setFont(  
				Font.font( "Tahoma", FontWeight.BOLD, 15 ) 
			);
			label.setFont(  
				Font.font( "Tahoma", FontWeight.NORMAL, 15 ) 
			);
			
			//Button event
			btn.setOnAction( e -> { 
				process();
			});

			//Adds elements
			/*layout.getChildren().add( label );
			layout.getChildren().add( input );
			layout.getChildren().add( btn );
			layout.getChildren().add( feedback );*/
			layout.getChildren().addAll( 
				label, 		//text
				input, 		//text
				btn,
				feedback	//text
			);
		}

		private void setPath() {
			String path = this.file.getAbsolutePath();

			label.setText( "Fichero seleccionado:" );
			input.setFill( Color.GREEN ); 
			input.setText( path );


		}


	/**********************************/
	/*** Internal classes *************/


		class Feedback {

			public void err( String msg ) {
			
				feedback.setFill( Color.FIREBRICK ); 
				feedback.setText( "No se ha formateado el código. \n" + msg );
			}

			public void ok() {
				
				feedback.setFill( Color.GREEN ); 
				feedback.setText( "Código formateado" );
			}

		} //class

		class Files {

			/**
			 * Reads and returns content from a file
			 * 
			 */
			public String getFileContent( File f ) {

				String res = "";


				if ( f != null ) {
					FileReader fr 	  = null;
					BufferedReader br = null;

					try {
						fr = new FileReader( f );
						br = new BufferedReader( fr );

						String st = br.readLine();
						while ( st != null ) {
							res = res + st + "\n";
							st = br.readLine();
						}

					} catch ( IOException e ) {
						new Feedback().err( "La lectura del fichero ha fallado." );

					} finally {

						try {
							fr.close();

						} catch ( IOException ex ) {

							System.out.println( "Error cerrando FileReader" );
						}
					}
				}
				

				return res;
			}

			/**
			 * Writes str in the file
			 *
			 * @param	  str   The string
			 */
			public void setFileContent( String str ) {
				
				FileWriter fw 	  = null;
				BufferedWriter bw = null;
				
				try {
					//The file will be rewrite
					bw = new BufferedWriter(
						new FileWriter( file, false )
					);
					
					bw.write( str, 0, str.length( ));

				} catch ( IOException e ) {
					new Feedback().err( "La escritura del fichero ha fallado." );

				} finally {

					try {
						bw.close();

					} catch ( IOException ex ) {

						System.out.println( "Error cerrando BufferedWriter" );
					}
				}
			}

		} //class

} //class