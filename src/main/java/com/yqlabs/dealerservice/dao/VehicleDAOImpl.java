/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.dao;

import com.yqlabs.dealerservice.model.DealerVarients;
import com.yqlabs.dealerservice.model.Image;
import com.yqlabs.dealerservice.model.Price;
import com.yqlabs.dealerservice.model.TestDrive;
import com.yqlabs.dealerservice.model.Vehicle;
import com.yqlabs.dealerservice.model.VehicleModel;
import java.io.Serializable;
import java.util.List;
import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mahandar
 */
public class VehicleDAOImpl implements VehicleDAO{
    @Autowired
	SessionFactory sessionFactory;
	
	 Session session = null;
	 Transaction tx = null;
    @Override
	public Vehicle getUserFromDB(int id) {
		session=sessionFactory.openSession();
		Vehicle user=(Vehicle)session.load(Vehicle.class, id);
		tx=session.getTransaction();
		session.beginTransaction();
		session.setCacheMode(CacheMode.IGNORE);
                tx.commit();
                session.clear();
                session.close();
		return user;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    @Override
	public List<Vehicle> getAllUserFromDB() {
		session=sessionFactory.openSession();
		Query query=session.createQuery("from Vehicle v");
		session.setCacheMode(CacheMode.IGNORE);
		List<Vehicle> userList=query.list();
		session.clear();
		session.close();
		return userList;
		
	}
    @Override
	public boolean insertUserInDB(Vehicle user) {
		session=sessionFactory.openSession();
		tx = session.beginTransaction();
		Serializable ie=session.save(user);
		 tx.commit();
		  session.close();
		  if(ie!=null){
			  return true;
		  }else{
			  return false;
		  }
	}

    @Override
    public boolean insertPriceInDB(Price price) {
        session=sessionFactory.openSession();
		tx = session.beginTransaction();
		Serializable s=session.save(price);
		 tx.commit();
		  session.close();
		  if(s!=null){
			  return true;
		  }else{
			  return false;
		  } }

    @Override
    public boolean insertTDriveInDB(TestDrive tDrive) {
        session=sessionFactory.openSession();
		tx = session.beginTransaction();
		Serializable e=session.save(tDrive);
		 tx.commit();
		  session.close();
		  if(e!=null){
			  return true;
		  }else{
			  return false;
		  }
    }

    @Override
    public List<Image> getAllImages() {
                session=sessionFactory.openSession();
		Query query=session.createQuery("from Image i");
		session.setCacheMode(CacheMode.IGNORE);
		List<Image> imageList=query.list();
		session.clear();
		session.close();
		return imageList;    
    }
    @Override
    public List<VehicleModel> getAllVehicles(){
        session=sessionFactory.openSession();
        Query query=session.createQuery("from VehicleModel h");
        session.setCacheMode(CacheMode.IGNORE);
        List<VehicleModel> vehModel=query.list();
        session.clear();
        session.close();
        return vehModel;
    }

    @Override
    public List<DealerVarients> getAllDealersFromDB() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from DealerVarients dv");
        session.setCacheMode(CacheMode.IGNORE);
        List<DealerVarients> dealerList=query.list();
        session.clear();
        session.close();
        return dealerList;
    }

    @Override
    public List<TestDrive> getTestList() {
                session=sessionFactory.openSession();
		Query query=session.createQuery("from TestDrive t");
		session.setCacheMode(CacheMode.IGNORE);
		List<TestDrive> testList=query.list();
		session.clear();
		session.close();
		return testList;    
    }

    
}
