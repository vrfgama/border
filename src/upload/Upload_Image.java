package upload;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Upload_Image {

	public static BufferedImage charge(String folder) throws IOException {
		return ImageIO.read(new File(folder));
	}	
}
