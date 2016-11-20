package th.ac.crru.ci;

public interface Database {
	public String connectDb(String connString);
	public String insertTable(String sql);
	public String updateTable(String sql);
	public String deleteTable(String sql);
	public String disconnectDb();
}
