package org.example;

import jakarta.persistence.*;
import org.example.Model.Category;
import org.example.Model.Film;
import org.example.Model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

//        Category category = entityManager.find(Category.class, 1);
//        System.out.println(category);
//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c", Category.class);
//        List<Category> categories = query.getResultList();
//        for (Category category: categories){
//            System.out.println(category.getId()+ ". "+category.getName());
//
//        }


//        String userQuery = "Intel Core I9 9900";
//        TypedQuery<Product> queryProduct = entityManager.createQuery("select p from Product p  where p.name = ?1 ", Product.class);
//        queryProduct.setParameter(1, userQuery);
//        Product product = queryProduct.getSingleResult();
//        System.out.println(product.getId()+" "+product.getName() + "  - "+ product.getPrice());


//        int maxPrice = 250000;
//        int minPrice = 150000;
//        TypedQuery<Product> queryProductPrice = entityManager.createQuery("select p from Product p  where p.price >= ?1 and p.price <= ?2", Product.class);
//        queryProductPrice.setParameter(1, minPrice);
//        queryProductPrice.setParameter(2, maxPrice);
//        List<Product> products = queryProductPrice.getResultList();
//
//        for (Product product: products){
//
//                System.out.println(product.getId()+" "+product.getName() + "  - "+ product.getPrice());
//
//
//        }
//        Category category = new Category();
//        category.setName("Наушники");
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(category);
//            entityManager.getTransaction().commit();
//            System.out.println("Категория создана");
//
//        } catch (Exception e){
//            entityManager.getTransaction().rollback();
//        }
//        Film film = new Film();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите название фильма");
//        film.setTitle(scanner.nextLine());
//        System.out.println("Введите рейтинг");
//        film.setRating(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Введите жанр фильма");
//        film.setGenre(scanner.nextLine());
//        System.out.println("Введите год выпуск фильма");
//        film.setReleaseYear(Integer.parseInt(scanner.nextLine()));
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(film);
//            entityManager.getTransaction().commit();
//            System.out.println("Фильм создан");
//
//        } catch (Exception e){
//            entityManager.getTransaction().rollback();
//            System.out.println(e.getMessage());
//        }

//        Film film = new Film();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите id фильма");
//        int findId = Integer.parseInt(scanner.nextLine());
//        Film findFilm = entityManager.find(Film.class, findId);
//        if (findFilm  == null) {
//            System.out.println("Фильм не найден");
//            return;
//        }
//
//        System.out.println("Введите название фильма " + findFilm.getTitle());
//        findFilm.setTitle(scanner.nextLine());
//        System.out.println("Введите рейтинг " + findFilm.getRating());
//        findFilm.setRating(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Введите жанр фильма " + findFilm.getGenre());
//        findFilm.setGenre(scanner.nextLine());
//        System.out.println("Введите год выпуск фильма " + findFilm.getReleaseYear());
//        findFilm.setReleaseYear(Integer.parseInt(scanner.nextLine()));
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.merge(findFilm);
//            entityManager.getTransaction().commit();
//            System.out.println("Фильм обновлен");
//
//        } catch (Exception e){
//            entityManager.getTransaction().rollback();
//            System.out.println(e.getMessage());
//        }


//        Film film = new Film();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите id фильма");
//        int findId = Integer.parseInt(scanner.nextLine());
//        Film findFilm = entityManager.find(Film.class, findId);
//        if (findFilm  == null) {
//            System.out.println("Фильм не найден");
//            return;
//        }
//
//        System.out.println("Введите название фильма " + findFilm.getTitle());
//        String findName = scanner.nextLine();
//        if (findName.isEmpty()) {
//            findFilm.setTitle(findFilm.getTitle());
//        } else {
//            findFilm.setTitle(findName);
//        }
//
//        System.out.println("Введите рейтинг " + findFilm.getRating());
//        String findRating = scanner.nextLine();
//        if (findRating.isEmpty()) {
//            findFilm.setRating(findFilm.getRating());
//        } else {
//            findFilm.setRating(Double.parseDouble(findRating));
//        }
//        //findFilm.setRating(Double.parseDouble(scanner.nextLine()));
//
//        System.out.println("Введите жанр фильма " + findFilm.getGenre());
//        String findGenre = scanner.nextLine();
//        if (findGenre.isEmpty()) {
//            findFilm.setGenre(findFilm.getGenre());
//        } else {
//            findFilm.setGenre(findGenre);
//        }
//        //findFilm.setGenre(scanner.nextLine());
//
//        System.out.println("Введите год выпуск фильма " + findFilm.getReleaseYear());
//        String findReleaseYear = scanner.nextLine();
//        if (findReleaseYear.isEmpty()) {
//            findFilm.setReleaseYear(findFilm.getReleaseYear());
//        } else {
//            findFilm.setReleaseYear(Integer.parseInt(findReleaseYear));
//        }
//        //findFilm.setReleaseYear(Integer.parseInt(scanner.nextLine()));
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.merge(findFilm);
//            entityManager.getTransaction().commit();
//            System.out.println("Фильм обновлен");
//
//        } catch (Exception e){
//            entityManager.getTransaction().rollback();
//            System.out.println(e.getMessage());
//        }
//        Product product = entityManager.find(Product.class, 1);
//        System.out.println("ID: " + product.getId());
//        System.out.println("Названия: " + product.getName());
//        System.out.println("ID Категория: " + product.getCategory().getId());
//        System.out.println("Названия категорий: " + product.getCategory().getName());


//        Category category = entityManager.find(Category.class, 1);

//        System.out.println(category.getName());
//        for (Product product: category.getProducts()){
//            System.out.println(" - " + product.getName() + " (" + product.getPrice() + ")");
//        }

//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c", Category.class);
//        List<Category> categories = query.getResultList();
//        for (Category category: categories){
//            System.out.println(category.getId()+ ". "+category.getName());
//            for (Product product: category.getProducts()){
//            System.out.println(" - " + product.getName() + " (" + product.getPrice() + ")");
//            }
//
//        }

        TypedQuery<Product> queryProduct = entityManager.createQuery("select p from Product p", Product.class);
        List<Product> products = queryProduct.getResultList();

        TypedQuery<Category> queryCategory = entityManager.createQuery("select c from Category c", Category.class);
        List<Category> categories = queryCategory.getResultList();


        for (Product product: products){

            System.out.println(product.getName() + product.getCategory().getName());
            for (Category category : categories){
                System.out.println(product.getName() + product.getCategory().getName()  );
            }


        }

    }
}