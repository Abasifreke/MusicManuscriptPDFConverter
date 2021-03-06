package Project;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.itextpdf.text.DocumentException;

public class DataTester 
{
	private Boolean emptyResult, barResult;
	private static ArrayList<char[][]> test, EmptyFile, IncompleteBar, MoonlightSonata, 
	RememberingRain, UnevenLines, NoFile, NullFile, ProseFile, ExtendedASCII, EmptyFileWithInfo, Test1;
	
//Testing DataToArray objects ------------------------------------------------------------------
		
		@Test //Tests to see if the conversion works for the test file.
		public void testData() throws DocumentException, IOException
		{
			test = DataToArray.textToArray("test.txt");
			emptyResult = (test.isEmpty()) ? false : true;
			barResult = (test.size() == 15) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test(expected = FileNotFoundException.class)
		//Tests to see if the conversion works with a non-existing file.
		public void noData() throws DocumentException, IOException
		{
			NoFile = DataToArray.textToArray("");
			emptyResult = (NoFile.isEmpty()) ? false : true;
			assertTrue(emptyResult);
		}
		@Test(expected = NullPointerException.class)
		//Tests to see if the conversion works for a null file.
		public void nullData() throws DocumentException, IOException
		{
			NullFile = DataToArray.textToArray(null);
			emptyResult = (NullFile.isEmpty()) ? false : true;
			assertTrue(emptyResult);
		}
		@Test //Tests to see if the conversion works for an empty file.
		public void EmptyFileData() throws DocumentException, IOException
		{
			EmptyFile = DataToArray.textToArray("EmptyFile.txt");
			emptyResult = (EmptyFile.isEmpty()) ? true : false;
			barResult = (EmptyFile.size() == 0) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the conversion works for the MoonlightSonata file.
		public void MoonlightSonataData() throws DocumentException, IOException
		{
			MoonlightSonata = DataToArray.textToArray("MoonlightSonata.txt");
			emptyResult = (MoonlightSonata.isEmpty()) ? false : true;
			barResult = (MoonlightSonata.size() == 35) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test(expected = IndexOutOfBoundsException.class) //I'm throwing an exception
		//Tests to see if the conversion works for the IncompleteBar file.
		public void IncompleteBarData() throws DocumentException, IOException
		{
			IncompleteBar = DataToArray.textToArray("IncompleteBar.txt");
			emptyResult = (IncompleteBar.isEmpty()) ? false : true;
			barResult = (IncompleteBar.size() == 0) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the conversion works for the RememberingRain file.
		public void RememberingRainData() throws DocumentException, IOException
		{
			RememberingRain = DataToArray.textToArray("RememberingRain.txt");
			emptyResult = (RememberingRain.isEmpty()) ? false : true;
			barResult = (RememberingRain.size() == 15) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test(expected = ArrayIndexOutOfBoundsException.class) //Tests to see if the conversion works for the UnevenLines file.
		public void UnevenLinesData() throws DocumentException, IOException
		{
			UnevenLines = DataToArray.textToArray("UnevenLines.txt");
			emptyResult = (UnevenLines.isEmpty()) ? false : true;
			barResult = (UnevenLines.size() == 1) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the conversion works for the Prose file.
		public void ProseData() throws DocumentException, IOException
		{
			ProseFile = DataToArray.textToArray("Prose.txt");
			emptyResult = (ProseFile.isEmpty()) ? false : true;
			barResult = (ProseFile.size() == 1) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the conversion works for the ExtendedASCII file.
		public void ExtendedASCIIData() throws DocumentException, IOException
		{
			ExtendedASCII = DataToArray.textToArray("ExtendedASCII.txt");
			emptyResult = (ExtendedASCII.isEmpty()) ? false : true;
			barResult = (ExtendedASCII.size() == 3) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the conversion works for the EmptyFileWithInfoData file.
		public void EmptyFileWithInfoData() throws DocumentException, IOException
		{
			EmptyFileWithInfo = DataToArray.textToArray("EmptyFileWithInfo.txt");
			emptyResult = (EmptyFileWithInfo.isEmpty()) ? true : false;
			barResult = (EmptyFileWithInfo.size() == 0) ? true : false;
			assertTrue(emptyResult && barResult);
		}
		@Test //Tests to see if the getter methods work for MoonlightSonata after conversion for the MoonlightSonata file.
		public void MSDataDecisionTable() throws DocumentException, IOException
		{
			MoonlightSonata = DataToArray.textToArray("MoonlightSonata.txt");
			emptyResult = (MoonlightSonata.isEmpty()) ? false : true;
			barResult = (MoonlightSonata.size() == 15) ? true : false;
			boolean spacing = (DataToArray.getSpacing() == 8.0) ;
			boolean row = (DataToArray.getTotalRowAmount() == 90) ;
			boolean barAmount = (DataToArray.getBarAmount() == 15) ;
			boolean column = (DataToArray.getMaxColumnAmount() == 53) ;
			boolean subtitle = (DataToArray.getsubTitle().equalsIgnoreCase("Default")) ;
			assertTrue(emptyResult && barResult && spacing && column && row  && barAmount && subtitle);
		}
		
		@Test //Testing boundary values at empty file construction.
		public void DefaultCreationBoundaryTests() throws DocumentException, IOException
		{
			EmptyFile = DataToArray.textToArray("EmptyFile.txt");
			emptyResult = (EmptyFile.isEmpty()) ? false : true;
			barResult = (EmptyFile.size() == 0) ? true : false;
			boolean spacing = (DataToArray.getSpacing() == 8.0) ;
			boolean row = (DataToArray.getTotalRowAmount() == 0) ;
			boolean barAmount = (DataToArray.getBarAmount() == 0) ;
			boolean subtitle = (DataToArray.getsubTitle().equalsIgnoreCase("Default")) ;
			boolean title = (DataToArray.getTitle().equalsIgnoreCase("Default")) ;
			assertTrue(barResult  && !emptyResult && spacing && barAmount && row  && subtitle && title);
			
		}
		
		@Test //Testing LengthOfPartition which outputs the # of characters in the latest block of manuscript
		public void LengthOfPartitionTest() throws DocumentException, IOException
		{
			Test1 = DataToArray.textToArray("Test1.txt");
			boolean correctLength = (DataToArray.LengthOfPartition() == 53);
			assertTrue(correctLength);
			
		}
}
