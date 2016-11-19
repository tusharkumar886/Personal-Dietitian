package in.zattack.personaldietician;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FatCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_cal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void fatCalculate(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.fat);

        String wst = editText1.getText().toString();
        String wt = editText2.getText().toString();

        float waist = Float.parseFloat(wst);
        float weight = Float.parseFloat(wt);
        float fatPercent;

        weight *= 2.20462;
        float result1 = (float) ((weight * 1.082) + 94.42);
        float leanWeight = (float) (result1 - (waist * 4.15));

        try {
            fatPercent = ((weight - leanWeight) * 100) / weight;
            textView.setText("Your Body Fat% is " + String.valueOf(fatPercent));
        } catch (ArithmeticException e) {
            textView.setText("Error!");
        }
    }
}
