package com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alura.jpa.modelo.Conta;

public class AlteraConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
	
		Conta conta =em.find(Conta.class, 1L);
		
		conta.setAgencia(666);
		
		
		em.getTransaction().begin();
			em.persist(conta);		
			
		em.getTransaction().commit();

	}
}
