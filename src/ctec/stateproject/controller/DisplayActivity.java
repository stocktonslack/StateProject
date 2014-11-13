package ctec.stateproject.controller;

import java.util.ArrayList;

import ctec.stateproject.model.AndroidState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends Activity
{
	private TextView displayView;
	private Button homeButton2;
	private AndroidState appState;
	private ArrayList <String> adjectiveList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		displayView = (TextView) findViewById(R.id.resultsView);
		homeButton2 = (Button) findViewById(R.id.homeButton2);
		appState = (AndroidState) this.getApplication();
		adjectiveList = new ArrayList <String>();
		
		showTransferInput();
				
		setupListeners();
		
		fillTheAdjectiveList();
	}
	
	private void fillTheAdjectiveList()
	{
		
	}
	
	private void showTransferInput()
	{
		displayView.setText(appState.getName() + " says: " + appState.getPhrase() + " because they " + appState.getBlather()
												+ " and they are " + appState.getAction());
		
	}
	
	private void setupListeners()
	{
		homeButton2.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent ();
				setResult(RESULT_OK, returnIntent);
				finish();
				
			}
		});
	}
}
