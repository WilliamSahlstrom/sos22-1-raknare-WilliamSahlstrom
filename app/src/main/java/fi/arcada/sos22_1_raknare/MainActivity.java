package fi.arcada.sos22_1_raknare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //deklarera
    TextView textHello;
    EditText editTextName;
    TextView textMean;

    double[] testdata = { 3, 5, 6,7 ,9 ,11 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisera variabler
         textHello = findViewById(R.id.helloText);
         editTextName = findViewById(R.id.editTextName);
        textMean = findViewById(R.id.textViewMean);

        //textHello.setText("Hello from MainActivity");
    }

    public void btnClick(View view) {
        String name = editTextName.getText().toString();
        textHello.setText(String.format("Hello %s", editTextName.getText()));
    }

    public void calculate(View view) {
        String meanStr = String.format("%.2f",Statistics.calcMean(testdata));
        textMean.setText(meanStr);
    }
}