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

public class AltasActivity extends Activity {

	EditText edTx1, edTx2,edTx3,edTx4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_altas);
		
		edTx1=(EditText) findViewById(R.id.edTx1);
		edTx2=(EditText) findViewById(R.id.edTx2);
		edTx3=(EditText) findViewById(R.id.edTx3);
		edTx4=(EditText) findViewById(R.id.edTx4);
	}
	
	 public void cargar(View v)
	    {
		 
		 	String nombre=edTx1.getText().toString();
		 	double precio = Integer.parseInt(edTx2.getText().toString());
		 	String tama=edTx3.getText().toString();
		 	String sabor=edTx4.getText().toString();
		 	
	    	AsyncHttpClient client = new AsyncHttpClient();
	    	client.get("http://server-93782.usw1-2.nitrousbox.com:9000/alta?n=" + nombre
	    			+"&pre=" + precio +"&t="+tama+"&s="+sabor
	    			
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
		getMenuInflater().inflate(R.menu.altas, menu);
		return true;
	}

}
