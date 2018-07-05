package com.developervishalsehgal.snackbarandroid;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.btn_one:
                snackbar = Snackbar.make(view, "i'm a short snackbar", Snackbar.LENGTH_SHORT);
                snackbar.show();
                break;
            case R.id.btn_two:
                snackbar = Snackbar.make(view, "i'm a long snackbar", Snackbar.LENGTH_LONG);
                snackbar.show();
                break;
            case R.id.btn_three:
                snackbar = Snackbar.make(view, "i'm a indefinite snackbar and goes only by swipe off right.", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "retrying...", Toast.LENGTH_LONG).show();
                    }
                });
                snackbar.show();
                break;
            case R.id.btn_four:
                snackbar = Snackbar.make(view, "i'm a customized snackbar,", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Really", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(view, "Eat.Code.Sleep-repeat", Snackbar.LENGTH_LONG);
                        snackbar1.setActionTextColor(Color.BLUE);

                        View snackview = snackbar1.getView();
                        TextView textView = (TextView) snackview.findViewById(android.support.design.R.id.snackbar_text);
                        textView.setTextColor(Color.MAGENTA);
                        snackbar1.show();
                    }
                });
                snackbar.setActionTextColor(Color.YELLOW);

                View snackView = snackbar.getView();
                TextView textViewone = (TextView) snackView.findViewById(android.support.design.R.id.snackbar_text);
                textViewone.setTextColor(Color.CYAN);
                snackbar.show();

                break;

        }
    }
}
