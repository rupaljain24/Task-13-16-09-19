import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class RetriveSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Util.getSF().openSession();
		
		String sql =" select * from emp ";
		SQLQuery query = session.createSQLQuery(sql);
		List<Object[]> list = query.list();
		for(Object objects[]:list)
		 {
			System.out.println(objects[0]+"  "+objects[1]+" "+objects[2]);
		}

	}

}
