package dad.javafx.CheckPalindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {

	private TextField nombreText;
	private Button saludarButton;
	private Label saludoLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Introduce una sentencia");
		nombreText.setMaxWidth(150);
		
		saludoLabel = new Label();
		
		saludarButton = new Button("Bruh");
		saludarButton.setDefaultButton(true);
		saludarButton.setOnAction(evento -> onsaludarButtonAction(evento));
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton, saludoLabel);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
private void onsaludarButtonAction(ActionEvent evento) {
		
		String palindromo = nombreText.getText();
		
		if (checkPalindrome(palindromo)) {
			
			saludoLabel.setText("Es palíndromo");
			saludoLabel.setStyle("-fx-text-fill: green;-fx-font: bold 20 consolas;");
			
		}
		else {
			
			saludoLabel.setText("No es palíndromo");
			saludoLabel.setStyle("-fx-text-fill: red;-fx-font: bold 20 consolas;");
		}
	}

boolean checkPalindrome(String inputString) {

    String palindromo = "";
    
    for (int i = inputString.length()-1; i >= 0; i--) {
        palindromo = palindromo + inputString.charAt(i);
    }
    
    return inputString.equals(palindromo);
}

public static void main(String[] args) {
	
	launch(args);
	
}

}
