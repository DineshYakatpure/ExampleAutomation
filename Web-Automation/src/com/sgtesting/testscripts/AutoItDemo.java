package com.sgtesting.testscripts;

public class AutoItDemo {

	public static void main(String[] args) {


		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:\\Autoit\\Test3.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
