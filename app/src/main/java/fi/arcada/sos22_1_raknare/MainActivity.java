package fi.arcada.sos22_1_raknare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //deklarera
    TextView textHello;
    EditText editTextName;
    TextView textMean;
    TextView textDataOut;
    //Vi skapar en array list för vår data mängd
    ArrayList<Double> dataset = new ArrayList<>();

    double[] testdata = { 2.6 ,12 ,3, 5, 6,7 ,9 ,11 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisera variabler
         textHello = findViewById(R.id.helloText);
         editTextName = findViewById(R.id.editTextName);
         textMean = findViewById(R.id.textViewMean);
         textDataOut = findViewById(R.id.datasetOut);


        for (int i = 0; i < testdata.length; i++) {
            //Vi lägger till testdata till arraylist
            dataset.add(testdata[i]);
        }

        //Vi skriver tillfälligt ut vår datamängd
        String dataOut = "";
        for (double number: Statistics.getSorted(dataset) ) {
            dataOut += number + " ";
        }
        textDataOut.setText(dataOut);

        //textHello.setText("Hello from MainActivity");
    }

    public void btnClick(View view) {
        String name = editTextName.getText().toString();
        textHello.setText(String.format("Hello %s", editTextName.getText()));
    }

    public void calculate(View view) {
        String meanStr = String.format("Medelvärde: %.2f\n Median: %.2f\nStd.avvikelse: %.2f",
                Statistics.calcMean(dataset),
                Statistics.calcMedian(dataset),
                Statistics.calcSD(dataset));
        textMean.setText(meanStr);
    }

}