import java.io.File;
import java.io.FilenameFilter;

public class TextFilenameFilter implements FilenameFilter {

	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}
	
	

}
