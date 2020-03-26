package control;

import java.awt.image.BufferedImage;
import java.io.IOException;

import gui.Interface;
import upload.Upload_Image;

public class Controller {

	public static void run() throws IOException {
		
		String folder= "resources/79212.jpg";
		BufferedImage buffer= Upload_Image.charge(folder);
		Interface.frame(buffer);
		
	}
}
