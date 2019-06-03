package org.app.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class SessionDao {
	
	protected Session currentSession;
	protected Transaction currentTransaction;
	
	public Session openCurrentSession()
	{
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}
	
	public Session openCurrentSessionWithTransaction()
	{
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession()
	{
		currentSession.close();
	}
	
	public void closeCurrentSessionWithTransaction()
	{
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() 
	{
		return HibernateUtility.getSessionFactory();
	}
	
	public Session getCurrentSession() {
		return currentSession;
	}
	
	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}
	
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}
	
	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	

}
