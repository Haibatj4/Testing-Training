package com.i.testcasesuite;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.i.pages.frame;
import com.i.utility.Baseclass;


public class Testcase1 {

	@Test
	public static void testcase1() throws AWTException
	{
	
		Baseclass.OpenBrowserApp();
		frame.frames();
		Baseclass.OpenAnotherBrowserApp();
		Baseclass.CloseBrowserApp();
	}
}
