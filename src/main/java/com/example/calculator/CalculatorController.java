package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    private double firstNumber = 0;
    private double secondNumber = 0;
    private double memorizedNumber = 0;
    private int operation = -1;
    private boolean written = false;

    @FXML
    private Button RoundToZeroButton;

    @FXML
    private Button addButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button exponentButton;

    @FXML
    private Button floatingPointButton;

    @FXML
    private TextField inputTextField;

    @FXML
    private Button memoryClearButton;

    @FXML
    private Button memoryMinusButton;

    @FXML
    private Button memoryPlusButton;

    @FXML
    private Button memoryRecallButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button numberEightButton;

    @FXML
    private Button numberFiveButton;

    @FXML
    private Button numberFourButton;

    @FXML
    private Button numberNineButton;

    @FXML
    private Button numberOneButton;

    @FXML
    private Button numberSevenButton;

    @FXML
    private Button numberSixButton;

    @FXML
    private Button numberThreeButton;

    @FXML
    private Button numberTwoButton;

    @FXML
    private Button numberZeroButton;

    @FXML
    private Button percentButton;

    @FXML
    private Button piButton;

    @FXML
    private Button roundToTwoButton;

    @FXML
    private Button signToggleButton;

    @FXML
    private Button squareRootButton;

    @FXML
    private Button subtractButton;

    @FXML
    void RoundToZeroButtonPressed(ActionEvent event) {
        double number = Double.parseDouble(inputTextField.getText());
        number = Math.round(number);
        inputTextField.setText(String.valueOf(number));
    }

    @FXML
    void addButtonPressed(ActionEvent event) {
        if (operation == -1) {
            firstNumber = Double.parseDouble(inputTextField.getText());
        } else {
            ActionEvent equalize = new ActionEvent();
            equalsButtonPressed(equalize);
            firstNumber = memorizedNumber;
        }
        inputTextField.setText("0");
        operation = 1;
        written = false;
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        inputTextField.setText("0");
        written = false;
    }

    @FXML
    void divideButtonPressed(ActionEvent event) {
        if (operation == -1) {
            firstNumber = Double.parseDouble(inputTextField.getText());
        } else {
            ActionEvent equalize = new ActionEvent();
            equalsButtonPressed(equalize);
            firstNumber = memorizedNumber;
        }
        inputTextField.setText("0");
        operation = 3;
        written = false;
    }

    @FXML
    void equalsButtonPressed(ActionEvent event) {
        secondNumber = Double.parseDouble(inputTextField.getText());
        switch (operation) {
            case 0 -> memorizedNumber = firstNumber - secondNumber;
            case 1 -> memorizedNumber = firstNumber + secondNumber;
            case 2 -> memorizedNumber = firstNumber * secondNumber;
            case 3 -> memorizedNumber = firstNumber / secondNumber;
            case 4 -> memorizedNumber = Math.pow(firstNumber, secondNumber);
            case -1 -> memorizedNumber = secondNumber;
        }
        firstNumber = 0;
        secondNumber = 0;
        inputTextField.setText(String.valueOf(memorizedNumber));
        operation = -1;
        written = false;
    }

    @FXML
    void exponentButtonPressed(ActionEvent event) {
        if (operation == -1) {
            firstNumber = Double.parseDouble(inputTextField.getText());
        } else {
            ActionEvent equalize = new ActionEvent();
            equalsButtonPressed(equalize);
            firstNumber = memorizedNumber;
        }
        inputTextField.setText("0");
        operation = 4;
        written = false;
    }

    @FXML
    void floatingPointButtonPressed(ActionEvent event) {
        if (inputTextField.getText().contains(".")) {
            inputTextField.setText("Invalid syntax");
            written = false;
        } else {
            inputTextField.setText(inputTextField.getText() + ".");
            written = true;
        }
    }

    @FXML
    void memoryClearButtonPressed(ActionEvent event) {
        memorizedNumber = 0;
        inputTextField.setText("0");
        written = false;
        operation = -1;
        firstNumber = 0;
        secondNumber = 0;
    }

    @FXML
    void memoryMinusButtonPressed(ActionEvent event) {
        firstNumber = memorizedNumber;
        operation = 0;
        ActionEvent equalize = new ActionEvent();
        equalsButtonPressed(equalize);
    }

    @FXML
    void memoryPlusButtonPressed(ActionEvent event) {
        firstNumber = memorizedNumber;
        operation = 1;
        ActionEvent equalize = new ActionEvent();
        equalsButtonPressed(equalize);
    }

    @FXML
    void memoryRecallButtonPressed(ActionEvent event) {
        inputTextField.setText(String.valueOf(memorizedNumber));
        written = false;
    }

    @FXML
    void multiplyButtonPressed(ActionEvent event) {
        if (operation == -1) {
            firstNumber = Double.parseDouble(inputTextField.getText());
        } else {
            ActionEvent equalize = new ActionEvent();
            equalsButtonPressed(equalize);
            firstNumber = memorizedNumber;
        }
        inputTextField.setText("0");
        operation = 2;
        written = false;
    }

    @FXML
    void numberEightButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("8");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 8);
        }
    }

    @FXML
    void numberFiveButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("5");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 5);
        }
    }

    @FXML
    void numberFourButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("4");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 4);
        }

    }

    @FXML
    void numberNineButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("9");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 9);
        }
    }

    @FXML
    void numberOneButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("1");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 1);
        }
    }

    @FXML
    void numberSevenButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("7");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 7);
        }
    }

    @FXML
    void numberSixButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("6");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 6);
        }
    }

    @FXML
    void numberThreeButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("3");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 3);
        }
    }

    @FXML
    void numberTwoButtonPressed(ActionEvent event) {
        if (!written) {
            inputTextField.setText("2");
            written = true;
        } else {
            inputTextField.setText(inputTextField.getText() + 2);
        }
    }

    @FXML
    void numberZeroButtonPressed(ActionEvent event) {
        if (!inputTextField.getText().equals("0")) {
            inputTextField.setText(inputTextField.getText() + 0);
        }
    }

    @FXML
    void percentButtonPressed(ActionEvent event) {
        double number = Double.parseDouble(inputTextField.getText());
        number = number * 100;
        inputTextField.setText(number + "%");
    }

    @FXML
    void piButtonPressed(ActionEvent event) {
        double pi = 3.1415926536;
        inputTextField.setText(String.valueOf(pi));
        written = false;
    }

    @FXML
    void roundToTwoButtonPressed(ActionEvent event) {
        double number = Double.parseDouble(inputTextField.getText());
        number = Math.round(number * 100);
        number = number / 100;
        inputTextField.setText(String.valueOf(number));
    }

    @FXML
    void signToggleButtonPressed(ActionEvent event) {
        double number = Double.parseDouble(inputTextField.getText());
        number = -number;
        inputTextField.setText(String.valueOf(number));
        written = true;
    }

    @FXML
    void squareRootButtonPressed(ActionEvent event) {
        double number = Double.parseDouble(inputTextField.getText());
        double result = Math.sqrt(number);
        inputTextField.setText(String.valueOf(result));
        memorizedNumber = result;
        written = false;
        operation = -1;
        firstNumber = 0;
        secondNumber = 0;
    }

    @FXML
    void subtractButtonPressed(ActionEvent event) {
        if (operation == -1) {
            firstNumber = Double.parseDouble(inputTextField.getText());
        } else {
            ActionEvent equalize = new ActionEvent();
            equalsButtonPressed(equalize);
            firstNumber = memorizedNumber;
        }
        inputTextField.setText("0");
        operation = 0;
        written = false;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
