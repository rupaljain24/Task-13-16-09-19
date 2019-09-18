import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.query.Query;

public class RetriveEmpHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Util.getSF().openSession();
		String hql = "select ename,sal from Emp where sal >:lowest order by sal";
		
		Query qr = session.createQuery(hql);
		qr.setParameter("lowest",50000);
		
		
		List<Object []>  emp = qr.list();
		
		for(Object objects[]:emp)
		 {
			System.out.println(objects[0]+"  "+objects[1]);
		}
	}

}
