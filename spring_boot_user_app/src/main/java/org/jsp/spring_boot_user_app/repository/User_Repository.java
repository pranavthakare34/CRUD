package org.jsp.spring_boot_user_app.repository;

import org.jsp.spring_boot_user_app.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface User_Repository extends JpaRepository<User,Integer>{

	User findById(int id);
	
	@Query("Select u from User u where u.email=:myemail And u.pwd=:mypwd")
	User validate(@Param("myemail") String email,@Param("mypwd") String pwd);
}
