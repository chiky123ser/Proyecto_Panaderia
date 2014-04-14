package com.app.panaderia;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CambioActivity extends Activity {
	EditText ediT1,ediT2,ediT3,ediT4,ediT5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cambio);
		ediT1=(EditText) findViewById(R.id.ediT1);
		ediT2=(EditText) findViewById(R.id.ediT2);
		ediT3=(EditText) findViewById(R.id.ediT3);
		ediT4=(EditText) findViewById(R.id.ediT4);
		ediT5=(EditText) findViewById(R.id.ediT5);
		
	}
	
	public void cambio(View v)
    {
	 
		int id = Integer.parseInt(ediT1.getText().toString());
		String nombre=ediT2.getText().toString();
	 	double precio = Integer.parseInt(ediT3.getText().toString());
	 	String tama=ediT4.getText().toString();
	 	String sabor=ediT5.getText().toString();
	 	
    	AsyncHttpClient client = new AsyncHttpClient();
    	client.get("http://server-93782.usw1-2.nitrousbox.com:9000/update?id="+id+
    			"&n="+nombre+
    			"&pre="+precio+
    			"&t="+tama+
    			"&s="+sabor
    			
    			, new AsyncHttpResponseHandler() {
    	    @Override
    	    public void onSuccess(String responde) {
    	    	
    	    	Gson g = new Gson();
    	    	
    	    	g.fromJson(responde, Pan.class);
    	    	    	    	
    	    	
    	    	}
    	    	
    	        
    	        //txt.setText(response);
    	    
    	});
    	
Intent i = new Intent(this,MainActivity.class);
    	
    	startActivity(i);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cambio, menu);
		return true;
	}

}
