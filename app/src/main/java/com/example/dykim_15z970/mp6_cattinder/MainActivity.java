package com.example.dykim_15z970.mp6_cattinder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*
    Buttons for swiping left, right, or pressing super like, respectively.
     */
    protected Button buttonLeft, buttonRight, buttonMid;


    /*
    Pics of other cats' profiles.
     */
    private ImageView catPic;

    /*
    Arraylist of cat pic IDs or something that the user liked 'yes' or 'super like' on.
     */
    protected List<Object> likes = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLeft = findViewById(R.id.buttonLeft);
        buttonLeft.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (this.equals(buttonLeft)) { //swipe left = no
            Toast toast = Toast.makeText(this, "You passed", Toast.LENGTH_LONG);
            toast.show();
        } else if (this.equals(buttonRight)) { //swipe right = yes
            Toast toast = Toast.makeText(this, "You liked", Toast.LENGTH_LONG);
            toast.show();
        } else if (this.equals(buttonMid)) { //click middle = super like
            Toast toast = Toast.makeText(this, "You SUPER liked", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Test", Toast.LENGTH_LONG);
            toast.show();
        }
        //switch out catPic to a new catPic on API, keep track of whether prev catPic was yes/no/super like
    }

    /**
     * User clicked middle button (super like).
     * @param v idk
     */
    public void onClickMid(View v) {

    }

}
