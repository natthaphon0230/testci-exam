package th.ac.crru.ci;

public class DatabaseDemo {

	public static void main(String[] args) {
		DatabaseFactory factory = new DatabaseFactory();
		Database db = factory.getDB("oracle");
		
		System.out.println(db.connectDb("oracle connection string"));
		System.out.println(db.insertTable("insert into table x"));
		System.out.println(db.updateTable("update into table x"));
		System.out.println(db.deleteTable("delete into table x"));
		System.out.println(db.disconnectDb());
		
		db = factory.getDB("mysql");
		
		System.out.println(db.connectDb("oracle connection string"));
		System.out.println(db.insertTable("insert into table x"));
		System.out.println(db.updateTable("update into table x"));
		System.out.println(db.deleteTable("delete into table x"));
		System.out.println(db.disconnectDb());
		

	}

}
