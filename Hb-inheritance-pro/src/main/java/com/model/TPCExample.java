package com.model;



public class TPCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr = null;
		try (Session ses = HbUtil.getSessionFactory().openSession()) {
            tr = ses.beginTransaction();
            Employee e1=new Employee("Ramesh");
            RegEmployee e2 =new RegEmp(5500,"sales","Suresh");
            Trainee e3 =new Trainee(200,"6month","Umesh");
		    ses.persist(e1);
		    ses.persist(e2);
		    ses.persist(e3);
		    tr.commit();
		    ses.close();
		}
		catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            e.printStackTrace();
        } 
    }
}

		
	
     

	
