package com.example.ex02;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
	String text1 ="Hello";
	String text2 ="GoodBye";
	private Button b1= (Button) findViewById(R.id.button1);
	private Button b2= (Button) findViewById(R.id.button2);
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	

	public class ClickButton implements OnClickListener{
		
		@Override
		public void onClick(View v) 
		{
			b1.setOnClickListener(this);
			b2.setOnClickListener(this);
			
			switch(v.getId())
			{

				case R.id.button1:
					Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT).show();
			    break;
			    case R.id.button2:
			    	Toast.makeText(getApplicationContext(), text2, Toast.LENGTH_SHORT).show();
			    break;
			}

		}

	}
	
	
	
	
}





