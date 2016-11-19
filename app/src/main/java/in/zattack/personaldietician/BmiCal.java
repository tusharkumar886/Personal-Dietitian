package in.zattack.personaldietician;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static in.zattack.personaldietician.R.id.bmi;

public class BmiCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_cal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void bmiCalculate(View v) {
        EditText editText1 = (EditText)findViewById(R.id.editText4);
        EditText editText2 = (EditText)findViewById(R.id.editText5);
        TextView bmiValue = (TextView) findViewById(bmi);

        String heightValue = editText1.getText().toString();
        String weightValue = editText2.getText().toString();
        float h = Float.parseFloat(heightValue);
        float w = Float.parseFloat(weightValue);

        h /=100;
        h*=h;
        float bmi;
        try {
            bmi = w / h;
            bmiValue.setText("Your BMI measure is " + String.valueOf(bmi));
        }catch (ArithmeticException e){
            bmiValue.setText("Error!!");
        }
    }
}
