package edu.vinaenter.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.vinaenter.models.Users;

@Repository
public class UsersDao {
	public List<Users> getUsers() {
		List<Users> list = new ArrayList<>();
		list.add(new Users(1, "abc", "123", "de-active"));
		list.add(new Users(2, "abc12", "124", "de-active"));
		list.add(new Users(3, "abc34", "abc", "active"));
		return list;
	}
}
