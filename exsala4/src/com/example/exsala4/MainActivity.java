package com.example.exsala4;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity 
{	
	
	private RadioButton button00;
	private RadioButton button01;
	private RadioButton button02;
	private Button button;
	private RadioGroup rG;
	private View View;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button00 = (RadioButton) findViewById(R.id.rbutton1);
        button01 = (RadioButton) findViewById(R.id.rbutton2);
        button02 = (RadioButton) findViewById(R.id.rbutton3);
        button = (Button) findViewById(R.id.button1);
        rG = (RadioGroup) findViewById(R.id.rgopcoes);
        View= findViewById(R.id.area);
        
	
	final RadioGroup rg = (RadioGroup)findViewById(R.id.rgopcoes);
	button.setOnClickListener(new OnClickListener() 
	{
        @Override
        public void onClick(View arg0)
        {
            int op = rg.getCheckedRadioButtonId();
            switch (op) 
            {
            case R.id.rbutton1:
                setColorRegion(Color.BLUE);
                break;
            case R.id.rbutton2:
                setColorRegion(Color.RED);
                break;
            case R.id.rbutton3:
                setColorRegion(Color.YELLOW);
                break;
            default: 
                setColorRegion(Color.BLACK);
                break;
            }       
              
        }
    });
	
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void setColorRegion(int color)
	{
        View.setBackgroundColor(color);
    } 
	 

}

