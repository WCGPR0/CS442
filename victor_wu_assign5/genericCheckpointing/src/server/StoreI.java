package genericCheckpointing.server;
import genericCheckpointing.server.StoreRestoreI;
import genericCheckpointing.util.MyAllTypesFirst;
import genericCheckpointing.util.MyAllTypesSecond;

public interface StoreI extends StoreRestoreI {
	void writeObj(MyAllTypesFirst aRecord, String wireFormat);
	void writeObj(MyAllTypesSecond aRecord, String wireFormat);
}
