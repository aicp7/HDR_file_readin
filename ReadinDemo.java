import java.io.File;
import java.io.IOException;


public class ReadinDemo {

	public static void main(String[] args) throws IOException{
		File infile=new File(args[0]);
		if(!infile.isFile())
		{
			System.err.println("Error: Input file does not exist.");
			System.exit(1);
			return;
		}
		
		HDRtofloatarray HDR1=new HDRtofloatarray(infile);
		float[][] lum=HDR1.getLumArray();
		int width=HDR1.getWidth();
		int height=HDR1.getHeight();
		
		//print width and height
		System.out.println("width = "+width+" height ="+height);
		
		//print first ten pixels in first row
		for(int i=0;i<10;i++)
		{
			System.out.println("No."+i+" pixel luminance value in first row is "+lum[0][i]);
		}

	}

}
