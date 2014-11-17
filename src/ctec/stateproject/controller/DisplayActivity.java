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
	/**
	 * The text for the second screen
	 */
	private TextView displayView;
	
	/**
	 * Button to return Home
	 */
	private Button homeButton2;
	
	/**
	 * The State to transfer the info across the screen
	 */
	private AndroidState appState;
	
	/**
	 * The list full of different adjectives
	 */
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
		
		fillTheAdjectiveList();
		
		showTransferInput();
				
		setupListeners();
		
		
	}
	
	private void fillTheAdjectiveList()
	{
		adjectiveList.add("studly");
		adjectiveList.add("muscularly");
		adjectiveList.add("happily");
		adjectiveList.add("greatly");
		adjectiveList.add("quick-wittedly");
		adjectiveList.add("slowly");
		adjectiveList.add("floppily");
		adjectiveList.add("fluidly");
		adjectiveList.add("smashingly");
		adjectiveList.add("fancily");
		adjectiveList.add("foolishly");
		
	}
	
	private void showTransferInput()
	{
		int randomIndex = (int) (Math.random()* adjectiveList.size());
		
		displayView.setText(appState.getName() + " says: " + appState.getPhrase() + " because they " 
						+ appState.getObject() + " and they are " + appState.getAction()+ " " + adjectiveList.get(randomIndex));
		
	}
	
	private void setupListeners()
	{
		homeButton2.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentview)
			{
				Intent returnIntent = new Intent ();
				setResult(RESULT_OK, returnIntent);
				finish();
				
			}
		});
	}
}
