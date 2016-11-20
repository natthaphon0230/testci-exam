package th.ac.crru.ci;

public class MySQL implements Database {

	@Override
	public String connectDb(String connString) {
		return "connect MySQL with " + connString;
	}

	@Override
	public String insertTable(String sql) {
		return "insert into table " + sql;
	}

	@Override
	public String updateTable(String sql) {
		return "update table " + sql;
	}

	@Override
	public String deleteTable(String sql) {
		return "delete table " + sql;
	}

	@Override
	public String disconnectDb() {
		return "disconnect MySQL";
	}

}
