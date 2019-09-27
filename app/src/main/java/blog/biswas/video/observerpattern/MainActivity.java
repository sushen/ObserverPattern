package blog.biswas.video.observerpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBinary;
    TextView tvHexa;
    TextView tvOctal;
    EditText edtValue;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBinary = findViewById(R.id.tvbinaryValue);
        tvHexa = findViewById(R.id.tvHexa);
        tvOctal = findViewById(R.id.tvOctal);
        edtValue=findViewById(R.id.edtValue);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBinary.setText("B : " + Integer.toBinaryString(Integer.valueOf(edtValue.getText().toString())));
                tvHexa.setText("H : " + Integer.toHexString(Integer.valueOf(edtValue.getText().toString())));
                tvOctal.setText("O : " + Integer.toOctalString(Integer.valueOf(edtValue.getText().toString())));

            }
        });


    }

}
