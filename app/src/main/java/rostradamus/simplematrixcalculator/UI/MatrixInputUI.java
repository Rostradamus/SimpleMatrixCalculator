import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import rostradamus.simplematrixcalculator.R;
import rostradamus.simplematrixcalculator.UI.MainActivity;
import rostradamus.simplematrixcalculator.model.MatrixController;
import rostradamus.simplematrixcalculator.model.VectorController;

public class MatrixInputUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.matrix_input_ui);
        final Button button = (Button) findViewById(R.id.home);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }

}