import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr=new Properties();

		FileInputStream f=new FileInputStream("D:\\JAVA CORSE\\Section-06 Array,Collection\\Properties\\src\\nav.properties");
		
		pr.load(f);
		
		System.out.println(pr.getProperty("dosa"));
		
		pr.setProperty("dosa", "23");
		
		System.out.println(pr.entrySet());
		
		FileOutputStream fo = new FileOutputStream("D:\\JAVA CORSE\\Section-06 Array,Collection\\Properties\\src\\nav.properties");
	pr.store(fo, "updated price");
	System.out.println(pr);
		
	}

}
