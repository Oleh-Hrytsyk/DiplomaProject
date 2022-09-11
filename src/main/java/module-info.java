module com.diploma.diagnosingsystem {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.diploma.diagnosingsystem to javafx.fxml;
	exports com.diploma.diagnosingsystem;
}