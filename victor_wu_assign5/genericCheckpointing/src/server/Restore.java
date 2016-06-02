package genericCheckpointing.server;
import genericCheckpointing.util.SerializaableObject;
import genericCheckpointing.server.StoreRestoreI;

public interface RestoreI extends StoreRestoreI {
	SerializableObj readObj(String wireFormat) throws Exception;
}
