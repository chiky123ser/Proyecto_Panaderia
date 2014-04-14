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

public class BajaActivity extends Activity {
		EditText edt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baja);
		edt1=(EditText) findViewById(R.id.edt1);
	}

	public void borrar(View v){
		int id = Integer.parseInt(edt1.getText().toString());
	 	
    	AsyncHttpClient client = new AsyncHttpClient();
    	client.get("http://server-93782.usw1-2.nitrousbox.com:9000/del?id=" +id
    			
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
		getMenuInflater().inflate(R.menu.baja, menu);
		return true;
	}

}
