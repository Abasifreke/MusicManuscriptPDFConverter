package Project;

import static org.junit.Assert.*;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.itextpdf.text.DocumentException;

public class PDFTester
{
	private Desktop desktop;
	
		@Before
		public void setUp() throws DocumentException, IOException
		{
			desktop = null;
		}

//Testing BarLinesPDF ------------------------------------------------------------------
		
		@Test (expected = FileNotFoundException.class)//Tests to see if the PDF has an empty destination. If it works, open it.
		public void emptyPDFDestination() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF(".txt", ".pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File(".pdf"));
		}
		@Test //Tests to see if the PDF creation was successful for Test.txt. If it works, open it.
		public void testPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("Test.txt", "test.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("test.pdf"));
		}
		
		@Test //Tests to see if the PDF creation was successful for EmptyFile.txt. If it works, open it.
		public void testEmptyFilePDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("EmptyFile.txt", "EmptyFile.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("EmptyFile.pdf"));
		}
		
		@Test //Tests to see if the PDF creation was successful for MoonlightSonata.txt. If it works, open it.
		public void testMoonlightSonataPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("MoonlightSonata.pdf"));
		}
		
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void testRememberingRainPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("RememberingRain.txt", "RememberingRain.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("RememberingRain.pdf"));
		}
		/*
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void unevenLinesPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("UnevenLines.txt", "UnevenLines.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("UnevenLines.pdf"));
		}
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void incompleteBarPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("IncompleteBar.txt", "IncompleteBar.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("IncompleteBar.pdf"));
		}
		*/
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void ProsePDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("Prose.txt", "Prose.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("Prose.pdf"));
		}
		
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void extendedASCIIPDF() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("ExtendedASCII.txt", "ExtendedASCII.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("ExtendedASCII.pdf"));
		}
		
		@Test //Tests to see if the PDF creation was successful for RememberingRain.txt. If it works, open it.
		public void emptyFileWithInfo() throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("EmptyFileWithInfo.txt", "EmptyFileWithInfo.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			desktop.open(new File("EmptyFileWithInfo.pdf"));
		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetGroupBarSpacingTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			assertTrue(BarLinesPDF.SetGroupBarSpacing(80));
			assertFalse(BarLinesPDF.SetGroupBarSpacing(-1));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetWhiteSpaceTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			assertTrue(BarLinesPDF.SetWhiteSpace(80));
			assertFalse(BarLinesPDF.SetWhiteSpace(-1));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetBarSpacingTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			assertTrue(BarLinesPDF.SetBarSpacing(80));
			assertFalse(BarLinesPDF.SetBarSpacing(-1));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetGivenSpacingTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			assertTrue(BarLinesPDF.SetGivenSpacing(8));
			assertFalse(BarLinesPDF.SetGivenSpacing(-1));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetNoteFontSizeTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			assertTrue(BarLinesPDF.SetNoteFontSize(20));
			assertFalse(BarLinesPDF.SetNoteFontSize(-1));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void getDestinationTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			//assertTrue(BarLinesPDF.SetNoteFontSize(20));
			//assertFalse(BarLinesPDF.SetNoteFontSize(-1));
			BarLinesPDF.destination1 = "ChangedDestination";
			assertTrue(BarLinesPDF.getDestination().equals("ChangedDestination"));

		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetTitleTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			BarLinesPDF.setTitle("Changed");
			assertTrue(BarLinesPDF.TITLE_STRING.equals("Changed"));
			
		}
		
		@Test //Checks that groupBarSpacing is properly changed
		public void SetSubTitleTest()throws DocumentException, IOException
		{
			BarLinesPDF.convertPDF("MoonlightSonata.txt", "MoonlightSonata.pdf");
			desktop = (Desktop.isDesktopSupported()) ? Desktop.getDesktop() : null;
			BarLinesPDF.setSubTitle("Changed");
			assertTrue(BarLinesPDF.COMPOSER_STRING.equals("Changed"));
			
		}
}	