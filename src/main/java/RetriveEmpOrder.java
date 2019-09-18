import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import java.util.*;

public class RetriveEmpOrder {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Criteria criteria = session.createCriteria(Emp.class);//
				Criterion crt2 = Restrictions.gt("sal",50000); //QBC & filteration ordering
				List<Emp> emps = criteria.list();
				Order order1 = Order.desc("sal");
				criteria.addOrder(order1);
				
				criteria.add(crt2);
				
				
				ProjectionList pList = Projections.projectionList();//creating projections
				PropertyProjection p1 = Projections.property("ename");
				PropertyProjection p2 = Projections.property("sal");
				pList.add(p1);
				pList.add(p2);
				criteria.setProjection(pList);
				
				List<Object []>  emp = criteria.list(); 
				for(Object objects[]:emp)
				 {
					System.out.println(objects[0]+"  "+objects[1]);
				}
				
				
				
	}

}
