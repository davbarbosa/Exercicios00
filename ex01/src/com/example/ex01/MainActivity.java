package com.example.ex01;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button button00;
	private Button button01;
	private ArrayList<Integer> colors;
	private int count = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button00 = (Button) findViewById(R.id.button00);
        button00.setOnClickListener(new Toaster());
        button01 = (Button) findViewById(R.id.button01);
        button01.setOnClickListener(new Toaster());
        colors = new ArrayList<Integer>();
		colors.add(Color.BLUE);
		colors.add(Color.GREEN);
		colors.add(Color.RED);
		colors.add(Color.YELLOW);
    }

    private class Toaster implements OnClickListener
    {
    	public void onClick(View clickedButton)
    	{
    		int indice = (int)(Math.random()*4);
    		int buttonID = clickedButton.getId();
    		if (buttonID == 0x7f080000)
    		{
    			button00.setTextColor(colors.get(indice));
    			
    		}else if(buttonID == 0x7f080001)
    		{
    				button01.setTextColor(colors.get(indice));
    		}
    		
    		count++;
    		Integer.toString(count);
    		Toast tempMessage = Toast.makeText(MainActivity.this, Integer.toString(count), Toast.LENGTH_SHORT);
    		
    		tempMessage.show();
    	}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}