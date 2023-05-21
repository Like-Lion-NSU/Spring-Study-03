//package com.example.todo.repository;
//
//import com.example.todo.Entity.Todo;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//import java.util.List;
//import java.util.Optional;
//
//public class JPATodoRepository implements TodoRepository{
//    @PersistenceContext
//    EntityManager em;
//
//    @Override
//    public Todo save(Todo todo) {
//        em.persist(todo);
//        return todo;
//    }
//
//    @Override
//    public Optional<Todo> findById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<Todo> findAll() {
//        return null;
//    }
//}
