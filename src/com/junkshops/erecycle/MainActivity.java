package com.junkshops.erecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
public static String ser;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void automobile(View v){
		ser = "automobile";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void battery(View v){
		ser = "battery";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void construction(View v){
		ser = "construction";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void electronics(View v){
		ser = "electronics";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void gardening(View v){
		ser = "gardening";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void glass(View v){
		ser = "glass";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void hazardous(View v){
		ser = "hazardous";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void household(View v){
		ser = "household";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void metal(View v){
		ser = "metal";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void paint(View v){
		ser = "paint";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}public void paper(View v){
		ser = "paper";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	public void plastic(View v){
		ser = "plastic";
		Intent intent = new Intent(this, ICListActivity.class);
		startActivity(intent);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
