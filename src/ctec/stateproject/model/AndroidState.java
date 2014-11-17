package ctec.stateproject.model;

import android.app.Application;

public class AndroidState extends Application
{
	private String name, age, phrase, object, action;
	
	public void onCreate()
	{
		name = "";
		age = "";
		phrase = "";
		object = "";
	}

	public String getName()
	{
		return name;
	}

	public String getAction()
	{
		return action;
	}

	public String getAge()
	{
		return age;
	}

	public String getPhrase()
	{
		return phrase;
	}

	public String getObject()
	{
		return object;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}

	public void setObject(String blather)
	{
		this.object = object;
	}
	
	public void setAction(String action)
	{
		this.action = action;
	}
	
}
