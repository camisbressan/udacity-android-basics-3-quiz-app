package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String resposta1;
    private int resposta2;
    private boolean resposta3A = false;
    private boolean resposta3B = false;
    private boolean resposta3C = false;
    private boolean resposta3D = false;
    private int resposta4;
    private int resposta5;
    private int resposta6;
    private int resposta7;
    private boolean resposta8A = false;
    private boolean resposta8B = false;
    private boolean resposta8C = false;
    private boolean resposta8D = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Limpar respostas
     */
    public void limparRespostas(View view) {
        // Limpando resposta 1
        EditText resposta1Text = (EditText) findViewById(R.id.resposta_1);
        resposta1Text.setText("");

        // Limpando resposta 2
        RadioGroup resposta2RadioGroup = (RadioGroup) findViewById(R.id.resposta_2);
        resposta2RadioGroup.clearCheck();

        // Limpando resposta 3
        CheckBox resposta3ACheckBox = (CheckBox) findViewById(R.id.resposta_3_a);
        resposta3ACheckBox.setChecked(false);
        CheckBox resposta3BCheckBox = (CheckBox) findViewById(R.id.resposta_3_b);
        resposta3BCheckBox.setChecked(false);
        CheckBox resposta3CCheckBox = (CheckBox) findViewById(R.id.resposta_3_c);
        resposta3CCheckBox.setChecked(false);
        CheckBox resposta3DCheckBox = (CheckBox) findViewById(R.id.resposta_3_d);
        resposta3DCheckBox.setChecked(false);

        // Limpando resposta 4
        RadioGroup resposta4RadioGroup = (RadioGroup) findViewById(R.id.resposta_4);
        resposta4RadioGroup.clearCheck();

        // Limpando resposta 5
        RadioGroup resposta5RadioGroup = (RadioGroup) findViewById(R.id.resposta_5);
        resposta5RadioGroup.clearCheck();

        // Limpando resposta 6
        RadioGroup resposta6RadioGroup = (RadioGroup) findViewById(R.id.resposta_6);
        resposta6RadioGroup.clearCheck();

        // Limpando resposta 7
        RadioGroup resposta7RadioGroup = (RadioGroup) findViewById(R.id.resposta_7);
        resposta7RadioGroup.clearCheck();

        // Limpando resposta 8
        CheckBox resposta8ACheckBox = (CheckBox) findViewById(R.id.resposta_8_a);
        resposta8ACheckBox.setChecked(false);
        CheckBox resposta8BCheckBox = (CheckBox) findViewById(R.id.resposta_8_b);
        resposta8BCheckBox.setChecked(false);
        CheckBox resposta8CCheckBox = (CheckBox) findViewById(R.id.resposta_8_c);
        resposta8CCheckBox.setChecked(false);
        CheckBox resposta8DCheckBox = (CheckBox) findViewById(R.id.resposta_8_d);
        resposta8DCheckBox.setChecked(false);

    }

    /**
     * Conferir respostas
     */
    public void conferirRespostas(View view) {

        int qtdAcertos = 0;

        // Armazenar as respostas
        armazenarRespostas(view);

        // Verificar as respostas
        if(resposta1.equalsIgnoreCase("Futebol")){
            qtdAcertos += 1;
        }
        if(resposta2 == 3){
            qtdAcertos += 1;
        }
        if(resposta3A == false && resposta3B == true && resposta3C == true && resposta3D == false) {
            qtdAcertos += 1;
        }
        if(resposta4 == 3){
            qtdAcertos += 1;
        }
        if(resposta5 == 1){
            qtdAcertos += 1;
        }
        if(resposta6 == 2){
            qtdAcertos += 1;
        }
        if(resposta7 == 2){
            qtdAcertos += 1;
        }
        if(resposta8A == true && resposta8B == true && resposta8C == true && resposta8D == false) {
            qtdAcertos += 1;
        }
        if(qtdAcertos == 8){
            Toast.makeText(getApplicationContext(), "Parabéns! Você acertou todas as questões!", Toast.LENGTH_SHORT).show();
        } else if (qtdAcertos >= 5){
            Toast.makeText(getApplicationContext(), "Você acertou " + qtdAcertos + " de um total de 8 questões!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Você acertou " + qtdAcertos + " de um total de 8 questões! Que tal tentar novamente?!", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Armazenar respostas
     */
    public void armazenarRespostas(View view) {

        // Armazenando resposta 1
        EditText nameText = (EditText) findViewById(R.id.resposta_1);
        resposta1 = nameText.getText().toString();

        // Armazenando resposta 2
        RadioGroup resposta2RadioGroup = (RadioGroup) findViewById(R.id.resposta_2);
        switch (resposta2RadioGroup.getCheckedRadioButtonId()) {
            case R.id.resposta_2_a:
                resposta2 = 1;
                break;
            case R.id.resposta_2_b:
                resposta2 = 2;
                break;
            case R.id.resposta_2_c:
                resposta2 = 3;
                break;
        }

        // Armazenando resposta 3
        CheckBox resposta3ACheckBox = (CheckBox) findViewById(R.id.resposta_3_a);
        resposta3A = resposta3ACheckBox.isChecked();
        CheckBox resposta3BCheckBox = (CheckBox) findViewById(R.id.resposta_3_b);
        resposta3B = resposta3BCheckBox.isChecked();
        CheckBox resposta3CCheckBox = (CheckBox) findViewById(R.id.resposta_3_c);
        resposta3C = resposta3CCheckBox.isChecked();
        CheckBox resposta3DCheckBox = (CheckBox) findViewById(R.id.resposta_3_d);
        resposta3D = resposta3DCheckBox.isChecked();

        // Armazenando resposta 4
        RadioGroup resposta4RadioGroup = (RadioGroup) findViewById(R.id.resposta_4);
        switch (resposta4RadioGroup.getCheckedRadioButtonId()) {
            case R.id.resposta_4_a:
                resposta4 = 1;
                break;
            case R.id.resposta_4_b:
                resposta4 = 2;
                break;
            case R.id.resposta_4_c:
                resposta4 = 3;
                break;
        }

        // Armazenando resposta 5
        RadioGroup resposta5RadioGroup = (RadioGroup) findViewById(R.id.resposta_5);
        switch (resposta5RadioGroup.getCheckedRadioButtonId()) {
            case R.id.resposta_5_a:
                resposta5 = 1;
                break;
            case R.id.resposta_5_b:
                resposta5 = 2;
                break;
            case R.id.resposta_5_c:
                resposta5 = 3;
                break;
        }

        // Armazenando resposta 6
        RadioGroup resposta6RadioGroup = (RadioGroup) findViewById(R.id.resposta_6);
        switch (resposta6RadioGroup.getCheckedRadioButtonId()) {
            case R.id.resposta_6_a:
                resposta6 = 1;
                break;
            case R.id.resposta_6_b:
                resposta6 = 2;
                break;
            case R.id.resposta_6_c:
                resposta6 = 3;
                break;
        }

        // Armazenando resposta 7
        RadioGroup resposta7RadioGroup = (RadioGroup) findViewById(R.id.resposta_7);
        switch (resposta7RadioGroup.getCheckedRadioButtonId()) {
            case R.id.resposta_7_a:
                resposta7 = 1;
                break;
            case R.id.resposta_7_b:
                resposta7 = 2;
                break;
            case R.id.resposta_7_c:
                resposta7 = 3;
                break;
        }

        // Armazenando resposta 8
        CheckBox resposta8ACheckBox = (CheckBox) findViewById(R.id.resposta_8_a);
        resposta8A = resposta8ACheckBox.isChecked();
        CheckBox resposta8BCheckBox = (CheckBox) findViewById(R.id.resposta_8_b);
        resposta8B = resposta8BCheckBox.isChecked();
        CheckBox resposta8CCheckBox = (CheckBox) findViewById(R.id.resposta_8_c);
        resposta8C = resposta8CCheckBox.isChecked();;
        CheckBox resposta8DCheckBox = (CheckBox) findViewById(R.id.resposta_8_d);
        resposta8D = resposta8DCheckBox.isChecked();

    }

}
