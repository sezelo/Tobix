package conexiones;

import java.sql.SQLException;

public class Main {

	public static void main(String [ ] args)
	{
		DBConnection db = new DBConnection();
		ActivityCrud x = new ActivityCrud(db);
		try {
			x.insertOriginalData("Informativo", "Activida Informativa", "30/03/2019", "12:30:00", "13:30:00", "WOW");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
