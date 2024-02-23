package com.example.andriodcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private String operator;
    private String num1 = ""; // Initialize to avoid null check
    private String num2 = ""; // Initialize to avoid null check

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.inputDisplay);

        // Initialize buttons
        Button btn0 = findViewById(R.id.numBtn0);
        Button btn1 = findViewById(R.id.numBtn1);
        Button btn2 = findViewById(R.id.numBtn2);
        Button btn3 = findViewById(R.id.numBtn3);
        Button btn4 = findViewById(R.id.numBtn4);
        Button btn5 = findViewById(R.id.numBtn5);
        Button btn6 = findViewById(R.id.numBtn6);
        Button btn7 = findViewById(R.id.numBtn7);
        Button btn8 = findViewById(R.id.numBtn8);
        Button btn9 = findViewById(R.id.numBtn9);
        Button subBtn = findViewById(R.id.subtractBtn);
        Button addBtn = findViewById(R.id.addBtn);
        Button divBtn = findViewById(R.id.divideBtn);
        Button multBtn = findViewById(R.id.multBtn);
        Button clearBtn = findViewById(R.id.clearBtn);
        Button equalsBtn = findViewById(R.id.equalsBtn);

        // Set onClick listeners
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        subBtn.setOnClickListener(this);
        addBtn.setOnClickListener(this);
        divBtn.setOnClickListener(this);
        multBtn.setOnClickListener(this);
        clearBtn.setOnClickListener(this);
        equalsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Get the ID of the clicked view
        Button btnValue = (Button) v;
        String value = textView.getText().toString();
        String buttonText = btnValue.getText().toString();
        int id = v.getId();

        // Append button text for number buttons
        if (id == R.id.numBtn0 || id == R.id.numBtn1 || id == R.id.numBtn2 || id == R.id.numBtn3 ||
                id == R.id.numBtn4 || id == R.id.numBtn5 || id == R.id.numBtn6 || id == R.id.numBtn7 ||
                id == R.id.numBtn8 || id == R.id.numBtn9) {
            textView.setText(value + buttonText);

        } else if (id == R.id.subtractBtn) {
            // Handle subtractBtn click
            if (value.equals("")) {
                textView.setText("-");
            } else {
                num1 = value;
                operator = "-";
                textView.setText("");
            }


        } else if (id == R.id.addBtn) {
            // Handle addBtn click
            if (value.isEmpty()) {
                textView.setText("Error");
            } else {
                num1 = value;
                operator = "+";
                textView.setText("");
            }

        } else if (id == R.id.divideBtn) {
            // Handle divideBtn click
            if (value.isEmpty()) {
                textView.setText("Error");
            } else {
                num1 = value;
                operator = "/";
                textView.setText("");
            }

        } else if (id == R.id.multBtn) {
            // Handle multBtn click
            if (value.isEmpty()) {
                textView.setText("Error");
            } else {
                num1 = value;
                operator = "*";
                textView.setText("");
            }
        } else if (id == R.id.clearBtn) {
            // Clear textView
            textView.setText("");
            num1 = "";
            num2 = "";
        } else if (id == R.id.equalsBtn) {
            // Perform calculation
            num2 = value;
            performCalculation();
        }
    }

    private void performCalculation() {
        if (num1.isEmpty() && num2.isEmpty()) {
            textView.setText("Error");
            return;
        }

        double one = Double.parseDouble(num1);
        double two = Double.parseDouble(num2);
        double result = 0;

        switch (operator) {
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "/":
                if (two != 0) {
                    result = one / two;
                } else {
                    textView.setText("Error");
                    return;
                }
                break;
            default:
                textView.setText("Unknown operator");
                return;
        }

        textView.setText(String.valueOf(result));
    }
}
