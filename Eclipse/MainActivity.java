package com.app.panaderia;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void altas(View v)
    {
    	Intent i = new Intent(this,AltasActivity.class);
    	
    	startActivity(i);
    }
	
	public void cambio(View v)
    {
    	Intent i = new Intent(this,CambioActivity.class);
    	
    	startActivity(i);
    }
	
	public void baja(View v)
    {
    	Intent i = new Intent(this,BajaActivity.class);
    	
    	startActivity(i);
    }
	
	public void mostrar(View v)
    {
    	Intent i = new Intent(this,ConsultaActivity.class);
    	
    	startActivity(i);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
