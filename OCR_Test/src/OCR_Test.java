import java.io.File; 

import net.sourceforge.tess4j.Tesseract; 
import net.sourceforge.tess4j.TesseractException; 

public class OCR_Test { 
	public static void main(String[] args) 
	{ 
		Tesseract tesseract = new Tesseract();
		
		try { 

			tesseract.setDatapath("D:/Eclipse Workspace/Tess4J/tessdata"); 

			// the path of your tess data folder 
			// inside the extracted file 
			String text 
				= tesseract.doOCR(new File("capture.png")); 

			// path of your image file 
			System.out.print(text); 
		} 
		catch (TesseractException e) { 
			e.printStackTrace(); 
		} 
	} 
}