package iics.cordova.andreicharls.lab4_exer;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = (Button) findViewById(R.id.btnToast);
        Button snackbarButton = (Button) findViewById(R.id.btnSnackbar);
        Button snackbarActionButton = (Button) findViewById(R.id.btnSnackbarAction);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.mainLayoutId);
                String message = "SNACKBAR!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        snackbarActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                View view = findViewById(R.id.mainLayoutId);
                String message = "SNACKBAR WITH ACTION!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbaract(view, message, duration);
            }
        });
    }

    public void showSnackbar(View view, String message, int duration) {
        Snackbar.make(view, message, duration).show();
    }

    public void showSnackbaract(View view, String message, int duration) {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }
}