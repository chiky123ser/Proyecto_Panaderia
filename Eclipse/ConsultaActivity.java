package com.app.panaderia;



import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class ConsultaActivity extends Activity {
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consulta);
		
		txt=(TextView) findViewById(R.id.textView1);
	}
	
	 public void consulta(View v)
	    {
	    	AsyncHttpClient client = new AsyncHttpClient();
	    	client.get("http://server-93782.usw1-2.nitrousbox.com:9000/mostrar", new AsyncHttpResponseHandler() {
	    	    @Override
	    	    public void onSuccess(String response) {
	    	    	
	    	    	Gson g = new Gson();
	    	    	
	    	    	Pan pan [] = g.fromJson(response, Pan[].class);
	    	    	
	    	    	
	    	    	
	    	    	if(pan != null){
	    	    		
	    	    		txt.setText("");
	    	    		for (int i = 0; i < pan.length; i++) {
	    	    			
	    	    		
	    	    			txt.append(pan[i].id + "\n");
	    	    			txt.append(pan[i].nombre + "\n");
	    	    			txt.append(pan[i].precio + "\n");
	    	    			txt.append(pan[i].tamaño + "\n");
	    	    			txt.append(pan[i].sabor + "\n");
							
							
						
							txt.append("----------------------- \n");
							
						}
	    	    	}
	    	    	
	    	        System.out.println(response);
	    	        //txt.setText(response);
	    	    }
	    	});
	    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consulta, menu);
		return true;
	}

}
