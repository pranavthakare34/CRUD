package org.jsp.spring_boot_user_app.dao;

import org.jsp.spring_boot_user_app.dto.User;
import org.jsp.spring_boot_user_app.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_app.dto.User;
import org.jsp.spring_boot_user_app.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public class User_Dao {
	@Autowired
	private User_Repository repository;
	
	
	public List<User> findAll() 
	{
	
		return repository.findAll();
	}


	public User findById(int id)
	{
		
		return repository.findById(id);
	}
	
	public void saveStudent(User user)
	{
		repository.save(user);
	}
	
	
	public void saveAll(List<User> user)
	{
		repository.saveAll(user);
	}

	public User updateStudent( int id,  User user)
	{
        User u = repository.getById(id);
        if (u != null) {
            u.setName(user.getName());
            u.setEmail(user.getEmail());
            u.setPwd(user.getPwd());
            return repository.save(u);
        } 
        
        else 
        {
            return null ;
        }
    }
	
	
	public void deleteById(int id)
	{
		repository.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
}
