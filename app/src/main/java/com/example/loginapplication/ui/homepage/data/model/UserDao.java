package com.example.loginapplication.ui.homepage.data.model;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface UserDao {
    @Query("SELECT * FROM user ORDER BY ID")
    List<User> loadAllUsers();

    @Insert
    void insertUser(User user);

    @Update
    void updateUser(User user);


    @Query("SELECT * FROM user WHERE id = :id")
    User loadUserById(int id);
}
