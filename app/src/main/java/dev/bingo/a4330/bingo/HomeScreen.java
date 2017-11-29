package dev.bingo.a4330.bingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class HomeScreen extends AppCompatActivity {
    //to be changed, testing for Westen
    Dog curDog=new Dog("Jack","80");
    Gson gson=new Gson();
    //TextView dogName=(TextView) findViewById(R.id.Dog_name);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //String jDog=getIntent().getStringExtra("jDog");
        //curDog=gson.fromJson(jDog, Dog.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        //dogName.setText(curDog.getName());
    }

    public void activityButton(View view) {
        Intent activityLog = new Intent(this, activityLog.class);
        String jDog=gson.toJson(curDog);
        activityLog.putExtra("jDog", jDog);
        startActivity(activityLog);
    }

    public void cameraButton(View view) {
        Intent gallery = new Intent(this, GalleryHomepage.class);
        startActivity(gallery);
    }

    public void healthButton(View view){
        Intent healthLog = new Intent(this, healthList.class);
        startActivity(healthLog);
    }

    public void listButton(View view){
        Intent dogList=new Intent(this, dogList.class);
        startActivity(dogList);
    }

    //overrides the back button in order to return the user to the homescreen
    @Override
    public void onBackPressed() {/*do nothing*/}
}
