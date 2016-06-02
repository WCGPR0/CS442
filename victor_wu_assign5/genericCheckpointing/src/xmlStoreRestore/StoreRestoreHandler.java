package genericCheckpointing.xmlStoreRestore;
import genericCheckpointing.util.SerializableObject;
import java.lang.Object;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import genericCheckpointing.util.FileProcessor;

public class StoreRestoreHandler implements InvocationHandler {

	public void openFile(String fileName) {
		FileProcessor myProcessor = new FileProcessor (arg);
	        while ((line = myFileProcessor.readLineFromFile()) != null) {
		}
	}

	public void closeFile () throws Exception {
		try {
			myProcessor.finalize();
		}
		catch (Exception err) {
			System.err.println("Error caught: " + err );
			err.printStackTrace();
		}
	}
	public void writeObj(MyAllTypesFirst first, String format, String fileIn) throws Exception {	
		System.out.println("<DPSerialization><complexType xsi:type=	
	}	
	public void writeObj(MyAllTypesSecond second, String format, String fileIn) throws Exception {
		
	}
	public SerializableObject readObj(String format) throws Exception {

	}	
	public Object invoke(Object proxy, Method m, Object [] args) {
			
	}
}
