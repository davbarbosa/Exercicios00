package com.example.exsala2;




import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends Activity {	
	
	private RadioButton button00;
	private RadioButton button01;
	private RadioButton button02;
	private TextView tView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button00 = (RadioButton) findViewById(R.id.rbutton1);
        button00.setOnClickListener(new Toaster());
        button01 = (RadioButton) findViewById(R.id.rbutton2);
        button01.setOnClickListener(new Toaster());
        button02 = (RadioButton) findViewById(R.id.rbutton3);
        button02.setOnClickListener(new Toaster());
        tView= (TextView) findViewById(R.id.area);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 private class Toaster implements OnClickListener
	    {
	    	public void onClick(View clickedButton)
	    	{
	    		int buttonID = clickedButton.getId();
	    		if (buttonID == R.id.rbutton1)
	    		{
	    			tView.setBackgroundColor(Color.RED);
	    			
	    		}else if(buttonID == R.id.rbutton2)
	    		{
	    			tView.setBackgroundColor(Color.BLUE);
	    		}
	    		else if(buttonID == R.id.rbutton3)
	    		{
	    			tView.setBackgroundColor(Color.YELLOW);
	    		}
	    		
	    	}
	    	
	    }

}
