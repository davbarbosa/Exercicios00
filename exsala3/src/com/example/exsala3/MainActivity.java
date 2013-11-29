package com.example.exsala3;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ToggleButton;
  
  
public class MainActivity extends Activity{
  
    private View mColorRegion;
      
      
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorRegion = findViewById(R.id.area);
        ToggleButton toggleButton1 = (ToggleButton)findViewById(R.id.toggle1);
        ToggleButton toggleButton2 = (ToggleButton)findViewById(R.id.toggle2);
        ToggleButton toggleButton3 = (ToggleButton)findViewById(R.id.toggle3);
          
    }
  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
      
    public void setColorRegion(int color){
        mColorRegion.setBackgroundColor(color);
    }
      
      
    public void showToggleButton1(View clickedToggleButton) {
        ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
        if(toggleButton.isChecked()) {
            setColorRegion(Color.RED);
        } else {
            setColorRegion(Color.BLACK);
        }
    } 
    public void showToggleButton2(View clickedToggleButton) {
        ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
        if(toggleButton.isChecked()) {
            setColorRegion(Color.BLUE);
        } else {
            setColorRegion(Color.BLACK);
        }
    } 
    public void showToggleButton3(View clickedToggleButton) {
        ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
        if(toggleButton.isChecked()) {
            setColorRegion(Color.YELLOW);
        } else {
            setColorRegion(Color.BLACK);
        }
    } 
  
  
      
} 
