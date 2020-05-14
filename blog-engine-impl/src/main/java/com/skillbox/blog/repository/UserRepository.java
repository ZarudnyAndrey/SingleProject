package com.skillbox.blog.repository;

import com.skillbox.blog.entity.User;
import java.util.HashSet;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findById(int Id);

  Optional<User> findByEmail(String email);

  Optional<User> findByCode(String code);

  @Query(nativeQuery = true, value = "SELECT e_mail FROM blog_user")
  HashSet<String> findAllEmails();

  @Query(nativeQuery = true, value = "SELECT name FROM blog_user WHERE id = :userId")
  String findNameById(int userId);
}
