package com.proware.tests;

import org.testng.annotations.Test;

import com.proware.common.BasePageTest;
import com.proware.pages.PlaceSelectionPage;
import com.proware.pages.SelectBusPage;

public class PlaceSelectionTest extends BasePageTest
{
	
	PlaceSelectionPage objPlaceSel=null;
	SelectBusPage objSelectBusPage=null;
	
	@Test
	public void SourceSel() throws Exception
	{
		objPlaceSel=new PlaceSelectionPage(uiDriver);
		objPlaceSel.selectSrcLocation("Bellary");
		objPlaceSel.selectDesLocation("Bengaluru");
		objPlaceSel.selectSrcDate("18");
		objSelectBusPage=objPlaceSel.clickOnSearchBuses();
		objSelectBusPage.verifyTitle(" 	Book Ticket - Search Buses ");
		
	}
	
	

}
