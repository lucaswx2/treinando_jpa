package com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alura.jpa.modelo.Conta;

public class CriaConta {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		Conta conta = new Conta();
		
		conta.setAgencia(12321);
		conta.setNumero(2525);
		conta.setTitular("Roberto");
		
		em.persist(conta);
		
		em.getTransaction().commit();
	}
	
}
