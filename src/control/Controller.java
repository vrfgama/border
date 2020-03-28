package control;

import java.awt.image.BufferedImage;
import java.io.IOException;

import gui.Interface;
import image.Convolution;
import upload.Upload_Image;

public class Controller {

	public static void run() throws IOException {
		
		String folder= "resources/79212.jpg";
		BufferedImage buffer= Upload_Image.charge(folder);
		
		
		Interface.frame(buffer);
		
		
		//Interface.frame(Convolution.convolve(buffer,Convolution.laplace));
		//Interface.frame(Convolution.convolve(buffer,Convolution.laplaceDiagonais));
		
		//Interface.frame( Convolution.border( Convolution.convolve(buffer, Convolution.sobelGx) , Convolution.convolve(buffer, Convolution.sobelGy) ));
		
	}
}
