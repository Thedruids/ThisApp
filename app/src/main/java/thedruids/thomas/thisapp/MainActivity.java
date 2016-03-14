package thedruids.thomas.thisapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    EditText editTxtUser;
    EditText editTxtPass;
    TextView txtRotate;
    TextView txtOrientation;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        editTxtUser = (EditText) findViewById(R.id.userEditText);
        editTxtPass = (EditText) findViewById(R.id.passEditText);
        txtRotate = (TextView) findViewById(R.id.txtView1);
        txtOrientation = (TextView) findViewById(R.id.txtView2);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", counter);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("count");
        counter++;


        if (counter == 1) {
            txtRotate.setText("You have rotated the screen 1 time");
        } else {
            txtRotate.setText("You have rotated the screen " + counter + " times");
        }

        if (counter % 2 == 0) {
            txtOrientation.setText("Screen Orientation: Portrait");
        } else {
            txtOrientation.setText("Screen Orientation: Landscape");
        }


    }


}