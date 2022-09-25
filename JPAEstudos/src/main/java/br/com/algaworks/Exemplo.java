package br.com.algaworks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.algaworks.model.Cliente;
public class Exemplo {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("cliente");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Cliente cliente = entityManager.find(Cliente.class, 1);

        System.out.println(cliente.getName());

        entityManager.close();
        entityManagerFactory.close();
    }
}
