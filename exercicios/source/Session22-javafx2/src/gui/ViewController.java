package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {
	@FXML
	private ComboBox<Person> cbPerson;

	private ObservableList<Person> obsPerson;

	@FXML
	private Button btnAll;

	@FXML
	public void onComboBoxPersonAction() {
		Person person = cbPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@FXML
	public void onBtAllAction() {
		for (Person person : cbPerson.getItems()) {
			System.out.println(person);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> lstPerson = new ArrayList<>();
		lstPerson.add(new Person(1, "Maria", "maria@gmail.com"));
		lstPerson.add(new Person(2, "Alex", "alex@gmail.com"));
		lstPerson.add(new Person(3, "Box", "bob@gmail.com"));

		obsPerson = FXCollections.observableArrayList(lstPerson);
		cbPerson.setItems(obsPerson);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person person, boolean empty) {
				super.updateItem(person, empty);
				setText(empty ? "" : person.getName());
			}
		};
		cbPerson.setCellFactory(factory);
		cbPerson.setButtonCell(factory.call(null));
	}
}
