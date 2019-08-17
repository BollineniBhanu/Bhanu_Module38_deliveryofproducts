package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.DeliveredOrderDAO;

@Service
@Transactional
public class DeliveryproserviceImpl implements deliveryproservice {
	@Autowired
	DeliveredOrderDAO deliverDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public void updateStatusAsDelivered(Integer transactionId) {
		// TODO Auto-generated method stub

		deliverDao.updateStatusAsDelivered(transactionId,"Delivered");
	}
}
