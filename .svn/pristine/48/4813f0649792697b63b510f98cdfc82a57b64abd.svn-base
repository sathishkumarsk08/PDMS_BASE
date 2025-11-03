package com.msp.pms.msppmsmodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Repository
@Transactional(value = "mspPmsTransactionManager")
public class LoginDAO {

	@Qualifier("mspPmsentityManagerFactory")
	@Autowired
	private EntityManager em;



	public Userdetails getAllPersons(String email, String pwd) {
		Userdetails user = null;
		try {
			final CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

			CriteriaQuery<Userdetails> crit = criteriaBuilder.createQuery(Userdetails.class);
			Root<Userdetails> root = crit.from(Userdetails.class);
			System.out.println("email "+email);
			System.out.println("pwdLoginDAO "+pwd);
			crit.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("email"), email),
					criteriaBuilder.equal(root.get("password"), pwd)));
			TypedQuery<Userdetails> query = em.createQuery(crit);
			user = (Userdetails) query.getSingleResult();
			/*
			 * if (user != null) { Hibernate.initialize(user.getLicenseissueoffice()); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("user "+user.getLoginStatus());
		return user;

	}



}
