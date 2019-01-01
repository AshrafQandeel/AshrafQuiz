package com.example.ashraf.ashrafquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int totalPoints = 0;
    private TextView result;
    private Button submitButton;
    private RadioGroup question3;
    private EditText codeEntry;
    private Boolean editTextStat = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question3 = findViewById(R.id.Q3RadioGroup1);
        question3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.question3_RadioBtn1:
                        if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                            submitButton.setEnabled(false);
                        } else submitButton.setEnabled(true);
                        break;
                    case R.id.question3_RadioBtn2:
                        if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                            submitButton.setEnabled(false);
                        } else submitButton.setEnabled(true);
                        break;
                    case R.id.question3_RadioBtn3:
                        if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                            submitButton.setEnabled(false);
                        } else submitButton.setEnabled(true);
                        break;
                    case R.id.question3_RadioBtn4:
                        if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                            submitButton.setEnabled(false);
                        } else {
                            submitButton.setEnabled(true);
                            totalPoints = totalPoints + 1;
                        }
                        break;
                }
            }
        });

        codeEntry = findViewById(R.id.Q4_editText);
        codeEntry.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                        actionId == EditorInfo.IME_ACTION_DONE ||
                        event != null &&
                                event.getAction() == KeyEvent.ACTION_DOWN &&
                                event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    if (event == null || !event.isShiftPressed()) {
                        // the user is done typing.
                        if (codeEntry.getText().toString().equals("123")) {
                            totalPoints += 1;
                            editTextStat = true;
                        } else {
                            editTextStat = false;
                        }
                        return false; // consume.
                    }
                }
                return false;

            }
        });
    }

    //onCheckboxClicked
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.question1_chBox1://one of the correct answers
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;
                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                }

                break;
            case R.id.question1_chBox2://incorrect answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                }

                break;
            case R.id.question1_chBox3://one of the correct answers
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                }

                break;
            case R.id.question1_chBox4://incorrect answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                }

                break;
            //the second question
            case R.id.question2_chBox1://incorrect answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;
                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                }

                break;
            case R.id.question2_chBox2://incorrect answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                }

                break;
            case R.id.question2_chBox3://the correct answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                }

                break;
            case R.id.question2_chBox4://incorrect answer
                if (checked) {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints - 1;

                } else {
                    if (testAllCheckboxesState() && question3.getCheckedRadioButtonId() == -1) {
                        submitButton.setEnabled(false);
                    } else submitButton.setEnabled(true);
                    totalPoints = totalPoints + 1;

                }

                break;
        }
    }

    public boolean testAllCheckboxesState() {
        boolean state;
        CheckBox q1a = findViewById(R.id.question1_chBox1);
        CheckBox q1b = findViewById(R.id.question1_chBox2);
        CheckBox q1c = findViewById(R.id.question1_chBox3);
        CheckBox q1d = findViewById(R.id.question1_chBox4);
        CheckBox q2a = findViewById(R.id.question2_chBox1);
        CheckBox q2b = findViewById(R.id.question2_chBox2);
        CheckBox q2c = findViewById(R.id.question2_chBox3);
        CheckBox q2d = findViewById(R.id.question2_chBox4);
        if (!q1a.isChecked() && !q1b.isChecked() && !q1c.isChecked() && !q1d.isChecked() || !q2a.isChecked() && !q2b.isChecked() && !q2c.isChecked() && !q2d.isChecked()
                || question3.getCheckedRadioButtonId() == -1) {
            state = true;
            result.setText("0");
        } else state = false;

        return state;
    }

}
