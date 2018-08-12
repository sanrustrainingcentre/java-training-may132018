import java.io.File;
import java.io.FilenameFilter;

public class ImageFilenameFilter implements FilenameFilter {

	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".jpeg") 
						|| name.endsWith(".jpg") 
						|| name.endsWith(".png") 
						|| name.endsWith(".gif") 
						|| name.endsWith(".svg");
	}
	
	

}
