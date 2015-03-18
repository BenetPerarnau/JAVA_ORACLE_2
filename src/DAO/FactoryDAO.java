package DAO;

public class FactoryDAO {
	
	public static OperacionesDAO getInstance(int i){
		switch(i){
		case 0:
			return new ClienteDAO();
		case 1:
			///----
			return null;
			default:
				return null;
		}
	}

}
