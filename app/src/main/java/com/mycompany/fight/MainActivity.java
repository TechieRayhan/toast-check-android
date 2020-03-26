package com.mycompany.fight;

import android.app.*;
import android.os.*;
import android.view.View;
import android.widget. *;
import android.widget.Button.*;
import android.widget.SearchView;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
		Button bb=(Button)findViewById(R.id.my_button);
		
		bb.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Toast.makeText(getApplicationContext(), "Well done!",  
							   Toast.LENGTH_LONG).show();

			}
		});
		
		
		}
}
