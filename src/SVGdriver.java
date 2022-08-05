import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;

public class SVGdriver {


	public static void SVGdriver(String source) throws IOException {
	
		SourceStringReader reader = new SourceStringReader(source);
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		// Write the first image to "os"
		String desc = reader.generateImage(os, new FileFormatOption(FileFormat.SVG));
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\Anti coding club\\Desktop\\here.svg");
		os.writeTo(outStream);
		outStream.close(); 

		// The XML is stored into svg
		
	//	final String svg = new String(os.toByteArray(), Charset.forName("UTF-8"));
		
		File file = new File("C:\\\\Users\\\\Anti coding club\\\\Desktop\\\\here.svg");
		Desktop.getDesktop().open(file);
		
	}

}
