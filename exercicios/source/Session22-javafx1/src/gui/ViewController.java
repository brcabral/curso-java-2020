package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable {
	@FXML
	private TextField txtNumberOne;

	@FXML
	private TextField txtNumberTwo;

	@FXML
	private Label lblResult;

	@FXML
	private Button btnSum;

	@FXML
	public void onBtnSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double numberOne = Double.parseDouble(txtNumberOne.getText());
			double numberTwo = Double.parseDouble(txtNumberTwo.getText());
			double sum = numberOne + numberTwo;
			lblResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			// Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumberOne);
		Constraints.setTextFieldDouble(txtNumberTwo);
		Constraints.setTextFieldMaxLength(txtNumberOne, 12);
		Constraints.setTextFieldMaxLength(txtNumberTwo, 12);
	}
}
