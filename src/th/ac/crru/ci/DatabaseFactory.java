package th.ac.crru.ci;

public class DatabaseFactory {
	public Database getDB(String dbName) {
		if (dbName.equalsIgnoreCase("oracle")) {
			return new Oracle();
		} else if (dbName.equalsIgnoreCase("mysql")) {
			return new MySQL();
		} else return null;
	}
}
