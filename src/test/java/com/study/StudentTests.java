package com.study;

import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTests {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");//persistence에 있는걸 불러온다.
    }

    @BeforeEach
    public void initManager(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach
    public void closeManager(){
        entityManager.close();
    }


    @AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    public void test(){
        Student student = new Student();
        student.name("소임");
        student.phone("010-3434-3434");
        student.address("김포");

        entityManager.persist(student);
    }
}
